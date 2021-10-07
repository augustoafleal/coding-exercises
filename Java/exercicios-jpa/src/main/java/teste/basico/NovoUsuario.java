package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {

	public static void main(String[] args) {
		
		
		// Cria o EntityManagerFactory. É importante porque o 
		// Entity Manager encapsulado apenas uma conexão e pode ser necessário 
		// outro Entity Manager para trabalhar com outro banco de dados
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("exercicios-jpa"); //exericios-jpa é o nome
		// a unidade de persistência que está no arquivo "persistence.xml"
		
		EntityManager em = emf.createEntityManager(); // Faz o CRUD no banco de dados e também representa a
		//conexão. Persiste as informações no banco de dados
		
		
		Usuario novoUsuario = new Usuario("Pato Donaldo", "donald@disney.com.br");
		
		// Como estou fazendo inserção no banco de dados, preciso
		// iniciar uma transação
		em.getTransaction().begin(); // iniciar transação
		em.persist(novoUsuario); // persistir - gera o Insert
		em.getTransaction().commit(); // concluir a transação
		
		System.out.println("Novo usuário gerado com sucesso com o id: " 
					+ novoUsuario.getId());
		
		em.close();
		emf.close();
		
		
	}

}
