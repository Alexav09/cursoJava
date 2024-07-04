package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao { // usando arquivo externo
	
public static Connection getConexao() throws IOException {
		
		try {
//			esses dados abaixo serão colocados em um arquivo .propert
			Properties prop = getProperties();
			final String url = prop.getProperty("banco.url");
//		o comando acima garante uma conexão segura mas não exige um certificado do servidor
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha"); 
			
			
			
			
			return DriverManager
					.getConnection(url, usuario, senha);
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	private static Properties getProperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties"; //ideal é que esse arquivo esteja na pasta 
		//do usuário, caso contrário ele será empacotado no arquivo.jar
				
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}

}
