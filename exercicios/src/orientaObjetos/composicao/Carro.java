package orientaObjetos.composicao;

public class Carro {
	Motor motor = new Motor();

	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
		motor.fatorInjecao += 0.4;
		}
	}

	void frear() {
		if (motor.giros() > 1200) {
			motor.fatorInjecao -= 0.4;

		} else {
			System.out.println("Motor na rotação mínima");
			
		}
	}

	void ligar() {
		motor.ligado = true;
	}

	void desligar() {
		motor.ligado = false;
	}

	boolean estaLigado() {
		return motor.ligado;
	}
}
