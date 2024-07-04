package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	
	public static void main(String[] args) throws SQLException, IOException {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome ou letra do nome que deseja pesquisar: ");
		String pessoa = entrada.next();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome like ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);//lembrar sempre de fazer dessa forma para evitar invasão pelo SQL
		stmt.setString(1, "%" + pessoa + "%" );
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		
		while(resultado.next()) {
			
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
			
		}
		
		for (Pessoa p:pessoas) {
			System.out.println(p.getCodigo() + " ==> " +p.getNome());
		}
		
		entrada.close();
		conexao.close();
	}

}
