package classe;

/*
 * Não é preciso importar a classe "Produto.java" porque ela está dentro do mesmo 
 * pacote deste arquivo. Com isso, não é necessário utilizar aqui o comando
 * "import nomeDoArquivo.pacoteDoArquivo"
 */

public class ProdutoTeste {

	public static void main(String[] args) {
		
		
		
		Produto p1 = new Produto("Notebook", 100); // o nome Produto ao final em verde
									//é o nome da classe 
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		//Abaixo utilizado "var" para mostrar como o Java consegue inferir o tipo
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 100;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("A média do carrinho é R$%.2f.\n", mediaCarrinho);
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		
				
	}
}
