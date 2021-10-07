package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {

		// Obter dados para pesquisa:
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o dado para pesquisa: ");
		String pesquisa = scanner.nextLine();

		// Abrir conexão com banco de dados
		Connection conexao = FabricaConexao.getConexao();

		// Comando SQL com segurança (PreparedStatement):
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + pesquisa + "%"); // o % serve para dizer onde será realizada
		// a pesquisa
		ResultSet resultado = stmt.executeQuery();

		
		// Laço para exibir resultados:
		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			Pessoa ps = new Pessoa(codigo, nome);
			System.out.println(ps.getCodigo() + " => " + ps.getNome());
		}
		
		
		// Fechamento de entradas:
		scanner.close();
		stmt.close();
		conexao.close();

	}

}
