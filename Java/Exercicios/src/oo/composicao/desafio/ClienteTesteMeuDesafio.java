package oo.composicao.desafio;

public class ClienteTesteMeuDesafio {

	public static void main(String[] args) {
		
		//criar cliente com duas compras
		//cada compra 2 itens
		//cada item associado a produtos diferentes
		
		ClienteMeuDesafio c1 = new ClienteMeuDesafio ("João");
		
		//COMPRA 1
		
		CompraMeuDesafio compra1 = new CompraMeuDesafio();
		ProdutoMeuDesafio p1 = new ProdutoMeuDesafio("Banana", 2.5);
		ProdutoMeuDesafio p2 = new ProdutoMeuDesafio("Queijo", 3.5);
		ItemDesafio i1 = new ItemDesafio();
		ItemDesafio i2 = new ItemDesafio();
		i1.quantidadeProduto(p1, 2);
		i2.quantidadeProduto(p2, 3);
		
		//obter preco produto compra 1
		i1.obterValor();
		System.out.println(i1.valorMedio);
		i2.obterValor();
		System.out.println(i2.valorMedio);
		
		
		//adicionar itens na compra 1
		compra1.adicionarItem(i1);
		compra1.adicionarItem(i2);
		System.out.println(compra1.obterValorTotal());
		
		//COMPRA 2
		CompraMeuDesafio compra2 = new CompraMeuDesafio();
		ProdutoMeuDesafio p3 = new ProdutoMeuDesafio("Amora", 4);
		ProdutoMeuDesafio p4 = new ProdutoMeuDesafio("Fritas", 2);
		ItemDesafio i3 = new ItemDesafio();
		ItemDesafio i4 = new ItemDesafio();
		i3.quantidadeProduto(p3, 2);
		i4.quantidadeProduto(p4, 1);
		
		
		//obter preco produto compra 2
		i3.obterValor();
		System.out.println(i3.valorMedio);
		i4.obterValor();
		System.out.println(i4.valorMedio);
		
		
		//adicionar itens na compra 2
		compra2.adicionarItem(i3);
		compra2.adicionarItem(i4);
		System.out.println(compra2.obterValorTotal());
		
		//CLIENTE COMPRAS
		c1.adicionarCompra(compra1);
		c1.adicionarCompra(compra2);
		System.out.println(c1.obterGasto());
		
		
		
	}

}
