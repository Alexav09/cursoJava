package br.com.trifoglio.minado;

import br.com.trifoglio.minado.modelo.Tabuleiro;
import br.com.trifoglio.minado.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
		
		new TabuleiroConsole(tabuleiro);
	
		
			
	}

}
