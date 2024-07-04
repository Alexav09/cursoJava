package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(1));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("\n\nNome1: " + nome + "\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nSalario: "+salario+"\n\n");
		System.out.printf("Nome2: %s %s tem %d anos e ganha %f.",nome,sobrenome,idade,salario);
		System.out.printf("\n\nNome3: %s %s tem %d anos e ganha %.2f.",nome,sobrenome,idade,salario);
		
		
	}

}
