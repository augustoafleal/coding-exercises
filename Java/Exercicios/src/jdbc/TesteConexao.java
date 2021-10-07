package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		//String que representa o local em que o banco de dados está sendo acessado
		//"mysql" remete ao driver que vou acessar
		//"verifyServerCertificate=false" não verifica o certificado do servidor
		//& separa os dois comandos
		//"?useSSL=true" utiliza conexão segura
		
		final String usuario = "root";
		String senha = "12345678";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		//DriveManager lança uma exceção checada
		//Por isso é inserido o throws SQL Exception no método main
		
		System.out.println("Conexão efetuada com sucesso.");
		conexao.close();
		
		
	}

}
