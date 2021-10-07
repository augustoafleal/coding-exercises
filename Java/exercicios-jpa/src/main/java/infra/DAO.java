package infra;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

// Classe com generics
public class DAO<E> {
	
	private static EntityManagerFactory emf;
	private EntityManager em;
	private Class<E> classe;
	
	// Bloco estático inicializado sempre e é necessário quando
	// há um atributo estático que deve ser inicializado automaticamente
	static {
		try {
			emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		} catch (Exception e) {
			
		}
	}
	
	// Construção padrão, passando a classe nula
	public DAO() {
		this(null);	
	}
	
	public DAO(Class<E> classe) {
		this.classe = classe;
		em = emf.createEntityManager();
	}
	
	// Método que retorna a classe atual, o que permite chamar o método de forma
	// encadeada, gerando um encadeamento de métodos dentro de um mesmo código
	// Por exemplo: DAO<E>().teste().teste().teste()...
	public DAO<E> abrirT() { //abrirTransação
		em.getTransaction().begin();
		return this;
	}
	
	public DAO<E> fecharT() { 
		em.getTransaction().commit();
		return this;
	}

	public DAO<E> incluir(E entidade) { 
		em.persist(entidade);
		return this;
	}

	//Atomico porque faz a inclusão com todas as alterações necessárias
	public DAO<E> incluirAtomico(E entidade) { 
		return this.abrirT().incluir(entidade).fecharT();
	}
	
	public E obterPorId(Object id) { 
		return em.find(classe, id);
	}
	
	// limit: limita o número a ser pesquisado por vez (pesquisar
	// de dez em dez, por exemplo)
	public List<E> obterTodos(int qtde, int deslocamento){
		if(classe == null) {
			throw new UnsupportedOperationException("Classe nula.");
		}
		
		String jpql = "SELECT e FROM " + classe.getName() + " e";	
		TypedQuery<E> query = em.createQuery(jpql, classe);
		query.setMaxResults(qtde); // especifica o máximo de resultados desejados
		query.setFirstResult(deslocamento); // Seria o offset do SQL
		// e significa a partir de qual número passará a mostrar os resultados
			
		return query.getResultList();
		
	}
	
	// Cria um método igual ao acima, porém com o valor padrão nos parâmetros
	public List<E> obterTodos() {
		return this.obterTodos(10, 0);
	}
	
	public List<E> consultar(String nomeConsulta, Object... params) { 
		TypedQuery<E> query = em.createNamedQuery(nomeConsulta, classe);
		
		for (int i = 0; i < params.length; i+= 2) { //de dois em dois, pois primeiro
			//é o nome do parâmetro e depois é o valor
			query.setParameter(params[i].toString(), params[i + 1]);
		}
		
		return query.getResultList();
	}
	
	public E consultarUm(String nomeConsulta, Object... params) {
		List<E> lista= consultar(nomeConsulta, params);
		
			return lista.isEmpty() ? null : lista.get(0);
	}
	
	
	
		
		
		
	// Eu não fecho o EntityManagerFactory que serve para vários DAOs
	// por isso que ele é estático
	public void fechar() {
		em.close();
	}
	
	
	
	
	
	
}
