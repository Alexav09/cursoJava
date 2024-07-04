package classe;

public class PrimeiroTrauma {

	static int a = 3; // para que a variável a seja acessada pelo método main ela precisa ser Static
						// também assim como o método

	int b = 4;
	
	public static void main(String[] args) {
		
		System.out.println(a);
		
		//outra forma para acessar seria atravéz do uso de instancia
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.b);
	}

}
