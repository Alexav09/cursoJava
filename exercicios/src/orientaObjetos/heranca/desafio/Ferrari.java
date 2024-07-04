package orientaObjetos.heranca.desafio;

public class Ferrari extends Carro{
	
	//@Override => isso é uma annotation - indica que esta sobrescrevendo um método existente na classe original Carro
	@Override
	void acelerar() {
	
		//super.acelerar();// se mantiver esse código irá fazer o que está no método original + o que foi incrementado
			velocidadeAtual += 15;
	}

}
