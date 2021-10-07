package modelo.umpramuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import modelo.basico.Produto;

@Entity
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne // Many: terei muitos ITENS DE PEDIDO para um único pedido
				// enquanto PEDIDO será apenas um. O mesmo ocorre em relação ao PRODUTO
	private Pedido pedido;

	@ManyToOne(fetch = FetchType.EAGER) //esse é o fetch padrão
	private Produto produto;

	@Column(nullable = false) //não aceita valor nulo
	private int quantidade;

	@Column(nullable = false)
	private Double preco; // Tem um preço relacionado ao pedido na ocasião,
	// enquanto que o atributo preco no Produto pode variar ao longo do tempo.
	
	
	// CONSTRUTORES
	public ItemPedido() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemPedido(Pedido pedido, Produto produto, int quantidade) {
		super();
		this.setPedido(pedido);
		this.setProduto(produto);
		this.setQuantidade(quantidade);
	}

	
	// GETTERS AND SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
		
		if(produto != null && this.preco == null) { 
			this.setPreco(produto.getPreco());
			// o preço do produto será vinculado ao produto no momento que o produto
			// for inseerido
		}
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
