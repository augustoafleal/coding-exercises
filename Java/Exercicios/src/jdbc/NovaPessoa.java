package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe o nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";//O "?" é o comando
		//que será substituído pelo smt.setString abaixo
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		//setString porque recebo uma String do usuário que é o nome
		//o 1 antes da vírgula é o número parâmetro a ser substituído
		//O PreparedStatement faz toda a proteção necessário garantindo que o comando
		//inserido pelo usuário seja uma string
		
		stmt.execute();
		
		System.out.println("Pessoa incluída.");
				
		entrada.close();
	}

}
