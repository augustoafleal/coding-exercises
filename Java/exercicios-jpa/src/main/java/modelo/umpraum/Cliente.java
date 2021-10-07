package modelo.umpraum;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	
	@OneToOne(cascade = CascadeType.PERSIST) 
	//gera operação em cascata para inserção e merge
	
	@JoinColumn(name = "assento_id", unique = true)
	// Anotação específica para mapear campos que representam junção de tabelas
	// o unique cria um valor único
	
	private Assento assento;
	// Devo criar uma uma instância de Assento dentro de Cliente e colocar @OneToOne
	// que automaticamente o JPA sabe que deve criar uma coluna de nome assentos_id
	// que é a FOREIGN KEY, pois remete ao objeto criado na classe Assento.java
	
	
	// Construtores
	
	public Cliente() {

	}
	
	public Cliente(String nome, Assento assento) {
		this.nome = nome;
		this.assento = assento;
	}
	
	
	// Getters and setters

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

	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}
	
	
	
}
