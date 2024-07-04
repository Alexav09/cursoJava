package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException{
		
		final String stringDeConexao = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
//		o comando acima garante uma conexão segura mas não exige um certificado do servidor
		final String usuario = "root";
		final String senha = "Tryumph2024"; 
		
		
		Connection conexao = DriverManager
				.getConnection(stringDeConexao, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso");
		conexao.close();
	}

}
