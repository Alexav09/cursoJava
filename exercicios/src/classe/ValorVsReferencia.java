package classe;

import data.Data;

public class ValorVsReferencia {
	public static void main(String[] args) {

		double a = 2;
		double b = a;

		a++;
		b--;

		System.out.println("a = " + a + "\nb= " + b);// veja que nesse momento como são cópias temos alterações
														// distintas em cada
		// variável

		Data d1 = new Data(1, 6, 2022); // para conseguir usar a classe Data, foi necessário alterar os métodos e
										// variáveis como Public, veja no arquivo Data as alterações, além de import
										// data.Data
		Data d2 = d1;

		d1.ano = 2025; // neste momento veja que a alteração ocorre para d1 e d2

		System.out.println(d1.dataCompleta());
		System.out.println(d2.dataCompleta());

		voltarDataParaValorPadrao(d1);// da mesma forma a alteração ocorre no objeto de referencia alterando nas 2
										// variáveis

		System.out.println(d1.dataCompleta());
		System.out.println(d2.dataCompleta());

	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

}
