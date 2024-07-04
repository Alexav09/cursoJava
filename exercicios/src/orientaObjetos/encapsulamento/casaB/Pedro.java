package orientaObjetos.encapsulamento.casaB;

import orientaObjetos.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	//Ana mae = new Ana();// se instanciar não conseguirá utilizar a Herança, então deve acessar diretamente

	void testeAcessos() {
		//System.out.println(mae.segredoAna);// veja que nesse caso não consegue acesso pois o segredo que é privado
		//System.out.println(mae.facoDentroDeCasa);// mesmo com a Herança não consegue acessar
		//System.out.println(mae.formaDeFalar);// se instanciar não conseguirá utilizar a Herança, então deve acessar diretamente
		//System.out.println(mae.todosSabem);// se instanciar não conseguirá utilizar a Herança, então deve acessar diretamente
		System.out.println(formaDeFalar);// desta forma a propriedade de herança é funcional
		System.out.println(todosSabem);
		
	}

}
