package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
//		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
//		System.out.println(dao.incluir(sql, "Jojelson Jaimar"));
//		System.out.println(dao.incluir(sql, "Djalma Kioki"));
//		System.out.println(dao.incluir(sql, "Thanatos Yukai"));
		
		//AGORA PASSANDO O CÓDIGO COMO PARÂMETRO TAMBÉM 
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		System.out.println(dao.incluir(sql, "Daionilo Dainojo", 118));
		System.out.println(dao.incluir(sql, "Keko Kaka", 120));
		
		
		dao.close();

	}

}
