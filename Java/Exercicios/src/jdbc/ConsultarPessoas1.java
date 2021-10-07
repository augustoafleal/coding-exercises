package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaConexao.getConexao();

		String sql = "SELECT * FROM pessoas";

		Statement stmt = conexao.createStatement();
		ResultSet resultado = stmt.executeQuery(sql); // o comando "stmt.executeQuery()"
		// retorna um ResultSet, que permite guardar as informações obtidas do banco de
		// dados.
		// É que eu pego uma informação do banco de dados e trago para o java.

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) { // faz com que todos os registros sejam executados
			// até que a expressão "resultado.next()" retorne falso, neste caso o programa
			// sai do laço do while
			int codigo = resultado.getInt("codigo"); // aqui eu pego o o dado
			// que pertence à coluna de nome "codigo", e abaixo o dado que está inserido
			// na coluna com o nome "nome"
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));

		}

		for (Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " ==> " + p.getNome());
		}

		stmt.close();
		conexao.close();
	}
}

