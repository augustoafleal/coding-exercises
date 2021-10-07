package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {
	
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto("Geladeira", 2789.99);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		dao.abrirT()
		.incluir(produto)
		.incluir(pedido)
		.incluir(item)
		.fecharT();
		
		Produto produto2 = new Produto("Disco voador", 1082.25);
		ItemPedido item2 = new ItemPedido(pedido, produto2, 2);

		dao.abrirT()
			.incluir(produto2)
			.incluir(pedido)
			.incluir(item2)
			.fecharT()
			.fechar();
	}

}
