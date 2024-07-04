package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC

		final double MULT1 = 32;
		final double MULT2 = 5 / 9.0; // importante colocar o 9.0 ou 5.0 pois o java vai entender que estamos trabalhando com
										// numeros reais e não somente os inteiros
		double fahrenheit = 100;
		double celsius = (fahrenheit - MULT1) * MULT2;
		System.out.println("Temperatura fahrenheit = " + fahrenheit + " em celsius é = " + celsius + "ºC");
	}

}