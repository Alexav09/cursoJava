package fundamentos;

public class AreaCirdunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		// o recomendado para constantes é usar como letra maiúscula
		final double PI = 3.14159;// desta forma não permite mais que o valor do pi seja alterado no programa
		double area = PI * raio * raio;
		System.out.println("Área da Circunferência é = " + area + "m2.");
		

	}

}
