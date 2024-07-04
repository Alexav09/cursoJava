package br.com.trifoglio.minado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.trifoglio.minado.excecao.ExplosaoException;

public class Tabuleiro {

	private int linhas;
	private int colunas;
	private int minas;

	final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;

		gerarCampo();
		associarVizinhos();
		sortearMinas();
	}
	
	
	public void abrir(int linha, int coluna) {
//		Código anyterior
//		campos.parallelStream()
//			.filter(c -> c.getLinha() == linha && c.getColuna()==coluna)
//			.findFirst()
//			.ifPresent(c -> c.abrir());
//		Novo código
		try {
			campos.parallelStream()
			.filter(c -> c.getLinha() == linha && c.getColuna()==coluna)
			.findFirst()
			.ifPresent(c -> c.abrir());
		} catch (ExplosaoException e) {
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
		
	}

	public void alternarMarcacao(int linha, int coluna) {
		campos.parallelStream()
		.filter(c -> c.getLinha() == linha && c.getColuna()==coluna)
		.findFirst()
		.ifPresent(c -> c.alternarMarcacao());
	}
	
	
	
	private void gerarCampo() {
		for (int linha = 0; linha < linhas; linha++) {
			for (int coluna = 0; coluna < colunas; coluna++) {
				campos.add(new Campo(linha, coluna));
			}

		}
	}

	private void associarVizinhos() {
		for (Campo c1 : campos) {
			for (Campo c2 : campos) {
				c1.adicionarVizinho(c2);
			}

		}

	}

	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();

		do {
			int aleatorio = (int) (Math.random() * campos.size());
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		} while (minasArmadas < minas);

	}
	
	
	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}
	
	
	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("\n");
		sb.append("   ");
		for (int numColuna = 0; numColuna < colunas; numColuna++) {
			sb.append(" ");
			sb.append(numColuna);
			sb.append(" ");
			
		}
		
		sb.append("\n");
		int i=0;
		
		for (int linha = 0; linha < linhas; linha++) {
			
			sb.append(" ");
			sb.append(linha);
			sb.append(" ");
			for (int coluna = 0; coluna < colunas; coluna++) {
				sb.append(" ");
				sb.append(campos.get(i));
				sb.append(" ");
				i++;
				
			}
			sb.append("\n");
			
		}
		
		return sb.toString();
		
	}
	
	
	
}
