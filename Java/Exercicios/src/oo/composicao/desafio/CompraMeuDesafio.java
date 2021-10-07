package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;


public class CompraMeuDesafio {

	ClienteMeuDesafio cliente;
	ItemDesafio item;
	double totalCompra;
	List<ItemDesafio> itens = new ArrayList<>();
	
	
	
	void adicionarItem(ItemDesafio item) {
		itens.add(item);
	}
	
	double obterValorTotal() {
		for(ItemDesafio item: itens) {
			totalCompra += item.valorMedio;
		}
		return totalCompra;
	}
}
	
