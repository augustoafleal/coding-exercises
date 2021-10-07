package modelo.basico;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Para mais dúvidas sobre anotações, ver arquivo Usuario.java
@Entity
// @Table abaixo é sensível quanto ao local onde ele está colocando acima
// aqui estou definindo novo nome
@Table(name = "produtos", schema = "curso_java")
//quando trabalho com múltiplos schema, selecionar o nome auxilia 
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "prod_nome", length = 200, nullable = false)
	//nullable = false (NÃO ACEITA valor nulo)
	private String nome;

	@Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
	// precision (tamanho do número contando tudo, seja antes ou depois da vírgula)
	// scale (limita casas decimais, faz com que o 11 seja o valor total e 2 o número
	// após o ponto flutuante)
	private Double preco;

	// O construtor padrão é IMPRESCINDÍVEL para o JPA criar os objetos
	public Produto() {

	}

	public Produto(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
