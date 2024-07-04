package jdbc;

import java.io.IOException;

public class DAOTeste {
	
	public static void main(String[] args) throws IOException {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome) VALUES(?)";
		System.out.println(dao.incluir(sql, "João da Silva"));
		System.out.println(dao.incluir(sql, "Ana Julia"));
		System.out.println(dao.incluir(sql, "Djalma Pereira"));
		
		dao.close();
	}

}
