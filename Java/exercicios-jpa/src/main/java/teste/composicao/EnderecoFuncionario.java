package teste.composicao;

import infra.DAO;
import modelo.composicao.Endereco;
import modelo.composicao.Funcionario;

public class EnderecoFuncionario {

	public static void main(String[] args) {
		
		DAO<Funcionario> dao = new DAO<>(Funcionario.class);
		
		Endereco end = new Endereco();
		end.setLogradouro("Rua Augusta");
		end.setComplemento("N. 666");
		
		Funcionario func = new Funcionario();
		func.setNome("Alberto");
		func.setEndereco(end);
		
		dao.abrirT()
		.incluir(func)
		.fecharT()
		.fechar();
		
	}

}
