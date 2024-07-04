package orientaObjetos.heranca.desafio;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Civic c1 = new Civic();
		Ferrari c2 = new Ferrari();
		System.out.println(c1);
		System.out.println(c2);
		
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c2.acelerar();
		System.out.println(c1);
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		
		c1.frear();
		System.out.println(c1);
		
	}

}
