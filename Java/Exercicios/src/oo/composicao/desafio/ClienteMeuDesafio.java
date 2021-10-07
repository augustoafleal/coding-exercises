package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class ClienteMeuDesafio {

	String nome;
	CompraMeuDesafio compra;
	
	
	ClienteMeuDesafio (String nome){
		this.nome = nome;
	}
	
	List<CompraMeuDesafio> compras = new ArrayList<>();
	
	void adicionarCompra(CompraMeuDesafio compra) {
		compras.add(compra);
	}
	
	double obterGasto() {
		double total = 0;
		for(CompraMeuDesafio compra: compras) {
				total += compra.totalCompra;
			}
			return total;
		}
	
	
	//criar método para dizer quanto gasto pelo cliente
	//todas as compras
	
	//lista de compras
	
	//obter valor total das compras
	
}
