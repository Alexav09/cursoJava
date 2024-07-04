package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcluirPessoa {
	
	
		
	public static void main(String[] args) throws SQLException, IOException {
		Connection conexao = FabricaConexao.getConexao();
		
		
		//exibir os registros
		
		System.out.println("listagem de pessoas");
		System.out.println("");
		String consulta = "SELECT * FROM pessoas";
	
		PreparedStatement stmt = conexao.prepareStatement(consulta);
		ResultSet resultadoConsulta = stmt.executeQuery(consulta);
	
		List<Pessoa> pessoas = new ArrayList<>();
	
	
		while(resultadoConsulta.next()) {
		
		int codigo = resultadoConsulta.getInt("codigo");
		String nome = resultadoConsulta.getString("nome");
		pessoas.add(new Pessoa(codigo, nome));
		
		}
	
		for (Pessoa p:pessoas) {
		System.out.println(p.getCodigo() + " ==> " +p.getNome());
		}
		
		System.out.println("");
		
		stmt.close();
		//Exclusão do registro
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o código da pessoa a ser excluida: ");
		int codigo = entrada.nextInt();
		
		String exclusao = "DELETE FROM pessoas WHERE codigo = ?";
		
		stmt = conexao.prepareStatement(exclusao);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0 ) {
			System.out.println("Pessoa excluída com sucesso!");
		} else {
			System.out.println("Nada foi feito!");
		}
			
		
		conexao.close();
		entrada.close();
		
	}

}
