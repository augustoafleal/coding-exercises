package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class ObterUsuario {
	
	public static void main(String[] args) {
		
	EntityManagerFactory emf = Persistence
			.createEntityManagerFactory("exercicios-jpa");
	EntityManager em = emf.createEntityManager();
	
	// Para obter dados do usuário, não necessito fazer "transactions" como no 
	// da criação de novo usuário, em que há inserções..
	
	// No comando "em.find", o PRIMERIO parâmetro "Usuario.class" diz o tipo de classe 
	// que quero mapear e o SEGUNDO parâmaetro é o identificador que utilizo para 
	// obter o usuário
	Usuario usuario = em.find(Usuario.class, 3L);
	
	System.out.println(usuario.getNome());
	
	
	em.close();
	emf.close();	
		

	}
}
