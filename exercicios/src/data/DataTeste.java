package data;

public class DataTeste {

	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 10;
		d1.mes = 12;
		d1.ano = 2020;
		
		Data d2 = new Data();
		d2.dia = 23;
		d2.mes = 04;
		d2.ano = 1976;
		
		System.out.printf("\nData 1 = %d/%d/%d",d1.dia, d1.mes,d1.ano);
		System.out.println("\nData 1 = " + d1.dataCompleta()); //usando o metodo para facilitar e otimizar o código
		System.out.printf("\nData 2 = %d/%d/%d",d2.dia, d2.mes,d2.ano);
		System.out.println("\nData 2 = " + d2.dataCompleta()); //usando o metodo para facilitar e otimizar o código
	}
}
