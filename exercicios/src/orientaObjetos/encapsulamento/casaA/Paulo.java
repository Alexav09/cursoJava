package orientaObjetos.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();

	void testeAcessos() {
		//System.out.println(esposa.segredoAna);// veja que nesse caso não consegue acesso pois o segredo que é privado
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
	}
}
