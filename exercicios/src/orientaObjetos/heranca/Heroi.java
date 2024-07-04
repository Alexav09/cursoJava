package orientaObjetos.heranca;

public class Heroi extends Jogador { // extends caracteriza herança

	// com isso os códigos do Jogador estão automaticamente extendidos, desta forma
	// para usar o heroi no jogo baixa chamar que ele responde exatamente como o
	// Jogador

	// se desejarmos ter algo diferente do Jogador basta especificar aqui
	// exemplo abaixo: o ataque do Heroi (20) é mais forte do que o ataque do
	// monstro (20)

	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);

		if (deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;
		} else {
			return false;
		}

	}

	// ou podemos usar o conceito de superclasse desta forma o comando ficará de 2
	// ataques, para garantir os 20 pontos

	/**
	 * boolean atacar(Jogador oponente){ 
	 * 		boolean ataque1 = super.atacar(oponente);
	 * 		boolean ataque2 = super.atacar(oponente);
	 * 		return ataque1 || ataque2;
	 * }
	 */

}
