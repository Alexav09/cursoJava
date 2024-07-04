package fundamentos;

public class DesafioOperadoresAritimeticos {
	public static void main(String[] args) {
		int a = 6*(3+2);
		double b = Math.pow(a, 2);
		int c = 3*2;
		double c1 = b / c;
		System.out.println(c1);
		int d = (1-5)*(2-7)/2;
		double e = Math.pow(d, 2);
		System.out.println(e);
		double f = c1 - e;
		System.out.println(f);
		double g = Math.pow(f, 3);
		double h = Math.pow(10, 3);
		double i = g / h;
		System.out.println(i);
		
		
	}     

}
