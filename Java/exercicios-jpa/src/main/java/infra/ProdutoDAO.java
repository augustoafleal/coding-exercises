package infra;

import modelo.basico.Produto;

// No caso abaixo como faço uma herança da genérics DAO e vinculo ao produto,
// posso utilizar essa nova classe como faço em teste.basico.ObterProdutos
public class ProdutoDAO extends DAO<Produto> {
	
	// No construtor eu utilizo o super (chamando o construtor da classe pai) e 
	// passo Produto.class como parâmetro
	public ProdutoDAO() {
		super(Produto.class);
	}

}
