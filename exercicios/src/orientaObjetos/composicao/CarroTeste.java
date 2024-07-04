package orientaObjetos.composicao;

public class CarroTeste {
	
public static void main(String[] args) {
	
	Carro c1 = new Carro();
	System.out.println(c1.estaLigado());
	
	c1.ligar();
	System.out.println(c1.estaLigado());
	
	System.out.println(c1.motor.giros());
	
	c1.acelerar();
	System.out.println("acelerar 1 " + c1.motor.giros());
	c1.acelerar();
	System.out.println("acelerar 2 " + c1.motor.giros());
	c1.acelerar();
	System.out.println("acelerar 3 " + c1.motor.giros());
	c1.acelerar();
	System.out.println("acelerar 4 " + c1.motor.giros());
	
	System.out.println(c1.motor.giros());
	
	c1.frear();
	System.out.println("freio 1 " + c1.motor.giros());
	c1.frear();
	System.out.println("freio 2 " + c1.motor.giros());
	c1.frear();
	System.out.println("freio 3 " + c1.motor.giros());
	c1.frear();
	System.out.println("freio 4 " + c1.motor.giros());
	c1.frear();
	System.out.println("freio 5 " + c1.motor.giros());
	c1.frear();
	System.out.println("freio 6 " + c1.motor.giros());
	c1.frear();
	System.out.println("freio 7 " + c1.motor.giros());
	
}

}
