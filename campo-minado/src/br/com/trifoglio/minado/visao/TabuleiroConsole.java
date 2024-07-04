package br.com.trifoglio.minado.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.trifoglio.minado.excecao.ExplosaoException;
import br.com.trifoglio.minado.excecao.SairException;
import br.com.trifoglio.minado.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner entrada = new Scanner(System.in);

	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;

		executarJogo();

	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			
			while (continuar) {
				cicloDoJogo();
				
				System.out.println("Outra Partida? (S/n) ");
				String resposta = entrada.nextLine();

				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("Tchau!!!");
		} finally {
			entrada.close();
		}
	}

	private void cicloDoJogo() {
		try {
			
			while(!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro.toString());
				
				String digitado = capturarValorDigitado("Digite (x, y: ");
				
				//System.out.println(Arrays.toString(digitado.split(",")));
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
					.map(e -> Integer.parseInt(e.trim())).iterator();
				
				int x = xy.next();
				int y = xy.next();
				
				System.out.println("o valor de x é " + x);
				System.out.println("o valor de y é " + y);
				
				digitado = capturarValorDigitado("1 - Abrir ou 2 (Des)Marcar");
				
				if("1".equals(digitado)) {
					tabuleiro.abrir(x, y);
				} else if("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(x, y);
				}
				//System.out.println(xy.next());
				
			}
			
			//Não está apresentando as minas como * quando ganhamos o jogo
			System.out.println(tabuleiro);
			System.out.println("Você Ganhou!!!");
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Você Perdeu!!!");
		}
		
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = entrada.nextLine();
		
		if("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		
		return digitado;
	}

}
