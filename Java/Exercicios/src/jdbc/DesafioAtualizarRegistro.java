package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarRegistro {
	
	public static void main(String[] args) throws SQLException{
		
		// Recebendo informações do usuário:
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o ID do registro: ");
		int codigo = scanner.nextInt();
		scanner.nextLine();
				
		// Fazendo conexão com o banco de dados e realizando comando:
		Connection connection = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE codigo = ?";		
		PreparedStatement stmt = connection.prepareStatement(sql);
		stmt.setInt(1, codigo);
		ResultSet resultado = stmt.executeQuery();
	
		if(resultado.next()) {
			System.out.println("O nome atual é " + resultado.getString(2));
			
			System.out.print("Informe o novo nome: ");
			String novoNome = scanner.nextLine();
			
			// Novo comando SQL:
			sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
			
			stmt.close();
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("Registro alterado com sucesso.");
			
			// Mostrar resultado da alteração:
			sql = "SELECT * FROM pessoas WHERE codigo = ?";
			stmt = connection.prepareStatement(sql);
			stmt.setInt(1, codigo);
			resultado = stmt.executeQuery();
			
			if(resultado.next()) {
			
				System.out.println("Novo registro: " 
					+ resultado.getInt("codigo") + " -> " + resultado.getString("nome"));
			}
			
		} else { 
			System.out.println("Código não encontrado.");
		}
			
		scanner.close();
		connection.close();
		stmt.close();
				
	}

}
