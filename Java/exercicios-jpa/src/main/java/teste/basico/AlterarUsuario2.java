package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Pato Donald");
		
//		A consulta cria um ESTADO GERENCIADO, em que o jpa cria um gerenciamento 
//		sobre o objeto, e qualquer mudança será sincronizada com o banco de dados, 
//		mesmo que não seja com o método "em.merge();" como na 
//		"teste.basico.AlterarUsuario1.java"
//		A SOLUÇÃO É NÃO TRABALHAR COM OBJETO GERENCIADO com o comando "em.detach(objeto)"
//		(VIDE CLASSE teste.basico.AlterarUsuario3)
//		E SOMENTE QUANDO FOR NECESSÁRIO
//		PERSISTIR DEVE-SE USAR UM CONTEXTO GERACIONAL
		
		
		
		
		em.getTransaction().commit();
		
		
		
		
		em.close();
		emf.close();
		
		
	}

}
