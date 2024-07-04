package classe;

public class AreaCirc {
	double raio;
	static double pi; //veja que pi ficou italico, mostrando que está vinculado  classe e não mais ao objeto
	
	AreaCirc(double raioInicial) {
		
		raio = raioInicial;
	}
	
	double area() {
		return raio * raio * pi;
		
	}
	
}
