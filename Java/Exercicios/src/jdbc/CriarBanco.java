package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
	public static void main(String[] args) throws SQLException {
		

		final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "12345678";
		
		Connection conexao = DriverManager
				.getConnection(url, usuario, senha);
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java"); //comando SQL para ser executado
		//e criar o novo banco de dados
		//"CREATE DATABASE IF NOT EXISTS curso_java" o comando determina
		//a criação do banco de dados se ele ainda não existir e, se ele existe, não dá
		//mensagem de erro
		
		System.out.println("Banco criado.");
		conexao.close();
		
	}
}
