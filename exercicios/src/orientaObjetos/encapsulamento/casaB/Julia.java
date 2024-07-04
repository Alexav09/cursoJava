package orientaObjetos.encapsulamento.casaB;

import orientaObjetos.encapsulamento.casaA.Ana;

public class Julia {
	
	Ana sogra = new Ana();//como a Ana está fora do mesmo Package, e também não tem herança, logo somente consegue acesso ao Publico

	void testeAcessos() {
		//System.out.println(esposa.segredoAna);// veja que nesse caso não consegue acesso pois o segredo que é privado
		//System.out.println(sogra.facoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar);
		System.out.println(sogra.todosSabem);
	}

}
