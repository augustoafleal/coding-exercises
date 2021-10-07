package teste.consultaquery;

import infra.DAO;
import modelo.consulta.NotaFilme;

public class ObterMediaFilmes {
	
	public static void main(String[] args) {
		
		// A classe NotaFilme não é entidade conectada ao banco de dados
		// é a classe que irá receber os parâmetros gerados na consulta 
		
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		NotaFilme nota = dao.consultarUm("obterMediaGeralDosFilmes");

		System.out.println(nota.getMedia());
	
		dao.fechar();
	
	
	}
}
