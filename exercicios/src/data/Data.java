package data;

public class Data {
	public int dia;
	public int mes;
	public int ano;
	
	public Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	public Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}

	public String dataCompleta() {
		return (dia + "/" + mes + "/" + ano);
		// return String.format("%d/%d/%d", dia, mes, ano); //outra forma que pode ser
		// utilizada o que permitiria algumas formataçõe com números double por exemplo
	}

}
