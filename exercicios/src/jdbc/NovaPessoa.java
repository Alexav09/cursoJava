package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	
	public static void main(String[] args) throws SQLException, IOException{
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		String nome = entrada.next();
		
		Connection conexao = FabricaConexao.getConexao();
		
//		Atenção abaixo, nunca concatenar diretamente pois há uma vulnerabilidade de um hacker utilizar 
//		SQL Injection é o nome desse tipo de ataque
//		para inserir um comando e eliminar o banco por exemplo
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);// esse é o método que evita o SQL Injection
		stmt.setString(1, nome);
		stmt.execute();
		
		System.out.println("Pessoa Incluída com sucesso!!!");
		
		entrada.close();
		
	}

}
