package orientaObjetos.encapsulamento;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;
	

	public Pessoa(String nome, String sobrenome) {
		setNome(nome);
		setSobrenome(sobrenome);
		
	}

	// Getter = Leituras
	public String getNome() {// metodo Get = Ler
		return nome;
	}
	public String getSobrenome() {// metodo Get = Ler
		return sobrenome;
	}

	public int getIdade() {
		return idade;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}


	// Setter = Arterações
	public void setNome(String novoNome) { // metodo Set = alterar

		this.nome = novoNome.toUpperCase();
	}
	public void setSobrenome(String novoSobrenome) { // metodo Set = alterar
		
		this.sobrenome = novoSobrenome.toUpperCase();
	}
	
	
	

	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade>=0 && novaIdade<=120) {
			this.idade = novaIdade;
		}
	}
	
	
	
	@Override
	public String toString() {
		
		return "Olá meu nome é " + getNome() + " "+ getSobrenome() + " tenho " + idade + " anos";
	}
}
