package classe;

public class Produto {

	//VARIÁVEIS
	String nome;
	double preco;
	static double desconto = 0.25;
	

	Produto() {
		
	}
	
	Produto(double _desconto) {
		desconto = _desconto;
		
	}
	/*
	 * Abaixo um exemplo de construtor em que o parâmetro informado é convertido
	 * para dentro da variável nome
	 */
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	

	/* não é necessário incluir parâmetros no método se as entradas já estão 
	 * declaradas nas linhas acima do método 
	 */
	
	double precoComDesconto() {
			
			return preco * (1 - desconto);
	
	}
	
	//double precoComDesconto(double descontoDoGerente) {
		
	//	return preco * (1 - desconto + descontoDoGerente);
		
	//}
	
	/* Nos dois métodos criados acima, embora eles tenham o mesmo nome,
	 * os parâmetros não se repetem, por isso é possível fazê-los
	 */
}
