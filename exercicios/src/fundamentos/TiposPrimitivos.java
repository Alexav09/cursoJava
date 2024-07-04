package fundamentos;

public class TiposPrimitivos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// informações do funcionário

		// tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // os traços underline substituem o . separador de milhares, ajuda na
												// visualização

		// Tipos numéricos reais
		float salario = 11_445.44F; // nesse caso precisa incluir o F caso contrário o Java irá inferir como Double
									// e não como Float
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo boolean
		boolean estaDeFerias = false; //ou True
		
		//Tipo caractere
		char status = 'A'; //Ativo
		
		//dias de empresa
		System.out.println("Dias de empresa = " + anosDeEmpresa * 365);
		
	}

}
