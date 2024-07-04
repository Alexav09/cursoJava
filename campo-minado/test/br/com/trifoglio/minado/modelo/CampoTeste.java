package br.com.trifoglio.minado.modelo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.trifoglio.minado.excecao.ExplosaoException;

public class CampoTeste {

	private Campo campo;

	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}

	@Test
	void testeVizinhoRealDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);

	}

	@Test
	void testeVizinhoRealDistancia1Direita() {

		Campo vizinho = new Campo(3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);

	}

	@Test
	void testeVizinhoRealDistancia1EmCima() {

		Campo vizinho = new Campo(2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);

	}

	@Test
	void testeVizinhoRealDistancia1EmBaixo() {

		Campo vizinho = new Campo(4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);

	}

	@Test
	void testeVizinhoRealDistancia2Diagonal() {

		Campo vizinho = new Campo(2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);

		assertTrue(resultado);

	}

	@Test
	void testeNaoVizinho() {

		Campo vizinho = new Campo(1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		// assertTrue(resultado); // neste caso precisamos alterar o que queremos, pois
		// sempre queremos que o
		// teste dê verdadeiro
		assertFalse(resultado);
	}

	@Test
	void testeValorPadraoAtributoMarcado() { // valor original é False
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacao() {// valor original é falso com 1x alternarMarcacao teremos True
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacao1() { // nesse caso como inserimos 2 x alternarMarcacao então o valor volta a ser
									// false
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}

	@Test
	void testeAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}

	@Test
	void testeAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}

	@Test
	void testeAbrirMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
		assertFalse(campo.abrir());
	}

	@Test
	void testeAbrirComVizinhos1() {
		Campo campo11 = new Campo(1, 1);
		
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);	
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	@Test
	void testeAbrirComVizinhos2() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 1);
		campo12.minar();
		
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);	
		campo22.adicionarVizinho(campo12);	
		
		campo.adicionarVizinho(campo22);
		
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}

}
