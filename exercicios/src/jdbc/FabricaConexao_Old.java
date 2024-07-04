package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao_Old {
	
	public static Connection getConexao() { // sem usar arquivo externo
		
		try {
//			esses dados abaixo serão colocados em um arquivo .propert
			
			final String stringDeConexao = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSL=true";
//		o comando acima garante uma conexão segura mas não exige um certificado do servidor
			final String usuario = "root";
			final String senha = "Tryumph2024"; 
			
			
			
			
			return DriverManager
					.getConnection(stringDeConexao, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
