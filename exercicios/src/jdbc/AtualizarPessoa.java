package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarPessoa {
	
public static void main(String[] args) throws SQLException, IOException {
		
		//exibir os registros
	
		System.out.println("listagem de pessoas");
		System.out.println("");
		String sql1 = "SELECT * FROM pessoas";
		Connection conexao = FabricaConexao.getConexao();
	
		PreparedStatement stmt = conexao.prepareStatement(sql1);
		ResultSet resultado1 = stmt.executeQuery(sql1);
	
		List<Pessoa> pessoas1 = new ArrayList<>();
	
	
		while(resultado1.next()) {
		
		int codigo = resultado1.getInt("codigo");
		String nome = resultado1.getString("nome");
		pessoas1.add(new Pessoa(codigo, nome));
		
		}
	
		for (Pessoa p:pessoas1) {
		System.out.println(p.getCodigo() + " ==> " +p.getNome());
		}
	
		//inicia a atualização
	
	
		System.out.println("");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o codigo do nome que deseja alterar: ");
		int codigo = entrada.nextInt();
		entrada.nextLine();
		System.out.println("Informe o novo nome:");
		String pessoaNovo = entrada.nextLine();
		System.out.println(pessoaNovo);
		
		
		String sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		stmt.close();
		stmt = conexao.prepareStatement(sql);//lembrar sempre de fazer dessa forma para evitar invasão pelo SQL
		stmt.setString(1, pessoaNovo );
		stmt.setInt(2, codigo );
		stmt.execute();
		
		//ResultSet resultado = stmt.executeQuery();
		

		
		entrada.close();
		conexao.close();
	}

}
