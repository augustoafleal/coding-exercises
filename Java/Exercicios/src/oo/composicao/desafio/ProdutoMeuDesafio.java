package oo.composicao.desafio;

public class ProdutoMeuDesafio {
	
	double preco;
	String nome;
	ItemDesafio item;

	ProdutoMeuDesafio(String nome, double preco){
		this.preco = preco;
		this.nome = nome;
	}
	
	public String toString() {
		return nome;
	}

	
}
