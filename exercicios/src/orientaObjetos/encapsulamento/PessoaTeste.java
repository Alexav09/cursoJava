package orientaObjetos.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Luiza", "Nunes");
		p1.setIdade(30);// quando o atributo está publico há um risco de uso indevido da variável
		
		System.out.println(p1.getNome());
		System.out.println(p1.getSobrenome());
		

		p1.setNome("Alexandre");// o ganho para usar métodos é para permitir tratamentos, como por exemplo queremos que seja armazenado somente em letras maiusculas desta forma não precisa alterar nada na classe PessoaTeste
		p1.setSobrenome("Veca");
		System.out.println(p1.getIdade());
		
		System.out.println(p1.getNome());
		System.out.println(p1);// irá chamar o toString
		System.out.println(p1.getNomeCompleto());
		
	}

}
