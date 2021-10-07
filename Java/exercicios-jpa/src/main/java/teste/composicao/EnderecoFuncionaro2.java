package teste.composicao;

import infra.DAO;
import modelo.composicao.Funcionario;

public class EnderecoFuncionaro2 {

	public static void main(String[] args) {
		
		DAO<Funcionario> dao = new DAO<>();
		
		Funcionario func = new Funcionario();
		func.setNome("Opã");
		func.dadosEndereco("Rua dos Caras", "N. 99");
		
		dao.incluirAtomico(func);
		
		dao.fechar();
		
		
	}

}
