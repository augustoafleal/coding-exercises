package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 7L);
		em.detach(usuario); // DESASSOCIA a instância do ESTADO GERENCIADO
		usuario.setNome("Uncle Donald"); // assim esse comando não gera update
		// Deste modo, até eu não usar o merge, fica a desassociação funcionando

		// COMANDO: em.merge(usuario);

		em.getTransaction().commit();

		em.close();
		emf.close();
	}

}
