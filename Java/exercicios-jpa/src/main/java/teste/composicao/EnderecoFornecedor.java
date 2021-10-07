package teste.composicao;

import infra.DAO;
import modelo.composicao.Endereco;
import modelo.composicao.Fornecedor;

public class EnderecoFornecedor {

	public static void main(String[] args) {
		
		DAO<Fornecedor> dao = new DAO<>(Fornecedor.class);
		
		Endereco end = new Endereco();
		end.setLogradouro("Rua das Andradas");
		end.setComplemento("N. 38");
		
		Fornecedor forn = new Fornecedor();
		forn.setNome("Vesúvio");
		forn.setEndereco(end);
		
		dao.abrirT()
		.incluir(forn)
		.fecharT()
		.fechar();
		

	}

}
