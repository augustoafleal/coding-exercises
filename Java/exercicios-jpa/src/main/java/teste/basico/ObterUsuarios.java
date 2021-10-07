package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	
	// Consulta utilizando JPQL
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Java Persistence Query Language
		String jpql = "SELECT u FROM Usuario u";
		
		// À DIREITA passo dois atributos ao em.createQuery, o PRIMEIRO é o comando 
		// jpql e o SEGUNDO é a classe em que a consulta será realizada
		// À esquerda, crio um tipo query que retorna um Usuario 
		
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		
		// Limito a consulta a cinco resultados
		query.setMaxResults(5);

		// É na lista abaixo que se terá o resultado efetivo da pesquisa realizada
		//o get.ResultList poderia ter sido colocado após o comando acima
		// também "createQuery(jpql, Usuario.class)". No caso, não foi colocado
		// para que fosse possível limitar o por meio do "query.setMaxResults()";
		List<Usuario> usuarios = query.getResultList(); 
		
		/*		EXEMPLO DE COMO FICARIA TUDO EM APENAS UM COMANDO: 
		 * 
		 * 		List<Usuario> usuarios = em
				.createQuery("SELECT u FROM Usuario u", Usuario.class)
				.setMaxResults(5)
				.getResultList(); 
				
		 */
		
		
		for (Usuario usuario: usuarios) { 
			System.out.println("ID: " + usuario.getId() 
				+ " E-mail: " + usuario.getEmail());
			
		}
		
		em.close();
		emf.close();
		
	}
}
