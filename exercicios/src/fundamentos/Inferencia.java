package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		
		var c = "Texto";
		System.out.println(c);
		
		
		c = "outro texto";
		System.out.println(c);
		
		
		//c=4.5; // nesta situação o Java dará erro pois não pode converter o tipo de variável de String para double
		
		
	}

}
