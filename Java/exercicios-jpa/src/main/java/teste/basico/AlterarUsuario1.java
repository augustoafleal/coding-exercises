package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();
		
		
		// Como tenho que realizar um UPDATE, preciso iniciar uma transaction:
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 7L);
		usuario.setNome("Patinho Donaldinho");
		usuario.setEmail("patodonald@misney.com");
		
		
		// em.merge() faz o update no banco de dados
		em.merge(usuario);
		
		// Aqui eu confirmo a transaction com o commit
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
		
	}

}
