package orientaObjetos.heranca.desafio;

public class Carro {
	final int VELOCIDADE_MAXIMA;// Desafio herança #2
	
	int velocidadeAtual;
	int delta = 5;// Desafio herança #2
	
	Carro(int velocidadeMaxima){// Desafio herança #2
		VELOCIDADE_MAXIMA = velocidadeMaxima;// Desafio herança #2
	}// Desafio herança #2
	
	Carro(){// Desafio herança #2
		this.VELOCIDADE_MAXIMA = 200;// Desafio herança #2
		this.velocidadeAtual=0;// Desafio herança #2
	}
	void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
		velocidadeAtual += delta;
	}
	}

	
	void frear() {
		if(velocidadeAtual >=delta) {
			velocidadeAtual -=delta;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h";
	}
	
}
