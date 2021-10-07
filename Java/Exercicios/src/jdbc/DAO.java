package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	private Connection conexao;

	public int incluir(String sql, Object... atributos) { 
		try { 
			PreparedStatement stmt = getConexao().prepareStatement(
					sql, PreparedStatement.RETURN_GENERATED_KEYS);
			//"PreparedStatement.RETURN_GENERATED_KEYS" comando para retornar as chaves criadas
			
			adicionarAtributos (stmt, atributos);
			
			if(stmt.executeUpdate() > 0) { 
				ResultSet resultado = stmt.getGeneratedKeys();
				if(resultado.next()) { 
					return resultado.getInt(1);
				}
			}
			
			return -1;
			
		} catch (SQLException e) { 
			throw new RuntimeException(e);
		}
	}
	
	// Elimina a conexão de qualquer forma, porque do contrário ela sempre estará ativa
	public void close() {
		try {
			getConexao().close();
		} catch (SQLException e) {
			
		} finally {
			conexao = null;
		}
	}
	private void adicionarAtributos (PreparedStatement stmt, 
			Object[] atributos) throws SQLException{
		//recebe um stmt e um array de atributos.
		// Para cada tipo possível de atributo, faço um "if" dentro do laço for, utilizando
		// o índice e o possível atributo em String, int...
		// Este método adiciona os atributos passados na lista de atributos do método incluir
		// dentro da lista do statement para cada tipo que for passado
		int indice = 1;
		for(Object atributo: atributos) { 
			if(atributo instanceof String) { 
				stmt.setString(indice, (String) atributo);
				//Tenho que fazer um cast para String porque estou trabalhando com object
			} else if(atributo instanceof Integer) { 
				stmt.setInt(indice, (Integer) atributo);
			}
			
			indice++;
		} 
	}
	
	private Connection getConexao() {
		try {
			if (conexao != null && !conexao.isClosed()) { // se houer conexão e ela
				// não estiver fechada, o método retorna a conexao criada. Ocasião
				// em que aproveito a conexao decorrente da classe FabricaConexao
				return conexao;
			}
		} catch (SQLException e) {

		}
		// Se o try block não funcionar, eu crio uma conexão novamente a partir
		// da FabricaConexao
		conexao = FabricaConexao.getConexao();
		return conexao;
	}
}
