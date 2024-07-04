package orientaObjetos.polimorfismo;

public class Feijao {
	
	private double peso;
	
	
	//essa seria a forma de um polimorfismo estático
	public Feijao(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso>=0) {
			this.peso = peso;
			
		}
	}
	

}
