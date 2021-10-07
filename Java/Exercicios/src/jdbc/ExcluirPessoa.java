package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Informe o código: ");
		int codigo = scanner.nextInt();
		
		Connection connection = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		// Ao invés do "=" posso usar o > ou o <, de modo que serão deletadas mais
		// linhas de acordo com o comando
		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, codigo);
		int contador = stmt.executeUpdate();  // o executeUpate() retorna o valor de linhas 
												// afetadas
		if(contador > 0) { 
			System.out.println("Pessoa excluída com sucesso.");
		} else { 
			System.out.println("Não houve exclusão.");
		}
			
		System.out.println("Linhas afetadas: " + contador);		
		
		
		scanner.close();
		connection.close();
	}

}
