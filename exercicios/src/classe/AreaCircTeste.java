package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
		AreaCirc a2 = new AreaCirc(5);
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(AreaCirc.pi); //esse é o valor de Pi da aplicação definido na Classe AreaCirc
		System.out.println(Math.PI);//esse é o valor de Pi da API Math do próprio Java

		
		
	}
}
