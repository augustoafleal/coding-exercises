package oo.composicao.desafio;

public class ItemDesafio {
	
	int quantidade;
	ProdutoMeuDesafio produto;
	double valorMedio = 0;
	
	void quantidadeProduto(ProdutoMeuDesafio produto, int quantidade) { 
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
//	void addProduto(String nome, double preco) {
//		this.produto = new Produto(nome, preco);
//	}
	
	double obterValor() {
		this.valorMedio = quantidade * produto.preco;
		return valorMedio;
	}
	
	
}
