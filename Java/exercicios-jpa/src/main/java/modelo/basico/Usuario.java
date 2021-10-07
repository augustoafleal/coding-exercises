package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//por convenção o nome da tabela vai ser o mesmo nome da classe

@Entity
public class Usuario {
	
	
	//por convenção qualquer atributo que pertence a uma classe vai ser mapeado
	//para uma coluna do banco de dados
	//e o tipo de coluna dependerá do tipo do atributo
	
	@Id //cria o id como chave-primária
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//faz um AUTO_INCREMENT no atributo
	//a estratégia adotada "strategy" garante que cada entidade tenha sua própria
	//sequência de id
	//se não fosse IDENTITY, mas SEQUENCE, poderia compartilhar IDs entre 
	//classes(entidades) diferentes
	//AUTO cria uma SEQUENCE
	private Long id;

	private String nome;

	private String email;

	public Usuario() {

	}

	// Normalmente o id é criado automaticamente no banco de dados
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
