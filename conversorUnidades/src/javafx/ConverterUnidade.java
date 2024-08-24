package javafx;

public class ConverterUnidade {

	double valorConverter;
	String Unidade1;
	String Unidade2;
	String GrupoUnidade;
	double Fator;
	double FatorUnid1;
	double FatorUnid2;
	double ValorEmMetro;
	String Formula;

	ConverterUnidade(String GrupoUnidades, double ValorInicial, String UnidadeInicial1, String UnidadeInicial2) {
		valorConverter = ValorInicial;
		Unidade1 = UnidadeInicial1;
		Unidade2 = UnidadeInicial2;
		GrupoUnidade = GrupoUnidades;
	}

//	String FatorFinal() {
//		String FatorF = String.valueOf(Fator);
//		return FatorF;
//	}

	double ValorFinal() {
		switch (GrupoUnidade) {

//Armazenamento de dados ----------------------------------------------------------------------------------------
		// Fator 1
		// ----------------------------------------------------------------------------------------
		case "Armazenamento de dados":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);
			switch (Unidade1) { // divide por para converter para Bit
			case "Bit":
				FatorUnid1 = 1;
				break;
			case "Kilobit":
				FatorUnid1 = 0.001;
				break;
			case "Kibibit":
				FatorUnid1 = 0.000976563;
				break;
			case "Megabit":
				FatorUnid1 = 0.000001;
				break;
			case "Mebibit":
				FatorUnid1 = 9.53289E-07;
				break;
			case "Gigabit":
				FatorUnid1 = 0.000000001;
				break;
			case "Gibibit":
				FatorUnid1 = 9.31099E-10;
				break;
			case "Terabit":
				FatorUnid1 = 1E-12;
				break;
			case "Tebibit":
				FatorUnid1 = 9.09091E-13;
				break;
			case "Petabit":
				FatorUnid1 = 1E-15;
				break;
			case "Pebibit":
				FatorUnid1 = 8.88099E-16;
				break;
			case "Byte":
				FatorUnid1 = 0.125;
				break;
			case "Kilobyte":
				FatorUnid1 = 0.000125;
				break;
			case "Kibibyte":
				FatorUnid1 = 0.00012207;
				break;
			case "Megabyte":
				FatorUnid1 = 0.000000125;
				break;
			case "MebiByte":
				FatorUnid1 = 1.19204E-07;
				break;
			case "Gigabyte":
				FatorUnid1 = 1.25E-10;
				break;
			case "Gibibyte":
				FatorUnid1 = 1.16414E-10;
				break;
			case "Terabyte":
				FatorUnid1 = 1.25E-13;
				break;
			case "Tebibyte":
				FatorUnid1 = 1.13688E-13;
				break;
			case "Petabyte":
				FatorUnid1 = 1.25E-16;
				break;
			case "Pebibyte":
				FatorUnid1 = 1.11025E-16;
				break;
			}
			// Fator 2
			// ----------------------------------------------------------------------------------------
			switch (Unidade2) {// multiplica Bit por
			case "Bit":
				FatorUnid2 = 1;
				break;
			case "Kilobit":
				FatorUnid2 = 1.00E-03;
				break;
			case "Kibibit":
				FatorUnid2 = 0.000976563;
				break;
			case "Megabit":
				FatorUnid2 = 1e-6;
				break;
			case "Mebibit":
				FatorUnid2 = 9.5367e-7;
				break;
			case "Gigabit":
				FatorUnid2 = 1e-9;
				break;
			case "Gibibit":
				FatorUnid2 = 9.3132e-10;
				break;
			case "Terabit":
				FatorUnid2 = 1e-12;
				break;
			case "Tebibit":
				FatorUnid2 = 9.0949e-13;
				break;
			case "Petabit":
				FatorUnid2 = 1e-15;
				break;
			case "Pebibit":
				FatorUnid2 = 8.8818e-16;
				break;
			case "Byte":
				FatorUnid2 = 0.125;
				break;
			case "Kilobyte":
				FatorUnid2 = 0.000125;
				break;
			case "Kibibyte":
				FatorUnid2 = 0.00012207;
				break;
			case "Megabyte":
				FatorUnid2 = 1.25e-7;
				break;
			case "MebiByte":
				FatorUnid2 = 1.1921e-7;
				break;
			case "Gigabyte":
				FatorUnid2 = 1.25e-10;
				break;
			case "Gibibyte":
				FatorUnid2 = 1.1642e-10;
				break;
			case "Terabyte":
				FatorUnid2 = 1.25e-13;
				break;
			case "Tebibyte":
				FatorUnid2 = 1.1369e-13;
				break;
			case "Petabyte":
				FatorUnid2 = 1.25e-16;
				break;
			case "Pebibyte":
				FatorUnid2 = 1.1102e-16;
				break;
			}
			break;
//Comprimento ----------------------------------------------------------------------------------------
		case "Comprimento":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);
			// Fator
			// 1----------------------------------------------------------------------------------------
			switch (Unidade1) { // divide por para converter para metro
			case "Quilômetro":
				FatorUnid1 = 0.001;
				break;
			case "Metro":
				FatorUnid1 = 1;
				break;
			case "Centímetro":
				FatorUnid1 = 100;
				break;
			case "Milímetro":
				FatorUnid1 = 1000;
				break;
			case "Micrômetro":
				FatorUnid1 = 1e+6;
				break;
			case "Nanômetro":
				FatorUnid1 = 1e+9;
				break;
			case "Milha":
				FatorUnid1 = 0.000621504;
				break;
			case "Jarda":
				FatorUnid1 = 1.094;
				break;
			case "Pé":
				FatorUnid1 = 3.281;
				break;
			case "Polegada":
				FatorUnid1 = 39.37;
				break;
			case "Milha Náutica":
				FatorUnid1 = 0.000539957;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // multiplica metro por
			case "Quilômetro":
				FatorUnid2 = 0.001;
				break;
			case "Metro":
				FatorUnid2 = 1;
				break;
			case "Centímetro":
				FatorUnid2 = 100;
				break;
			case "Milímetro":
				FatorUnid2 = 1000;
				break;
			case "Micrômetro":
				FatorUnid2 = 1e+6;
				break;
			case "Nanômetro":
				FatorUnid2 = 1e+9;
				break;
			case "Milha":
				FatorUnid2 = 0.000621371;
				break;
			case "Jarda":
				FatorUnid2 = 1.09361;
				break;
			case "Pé":
				FatorUnid2 = 3.28084;
				break;
			case "Polegada":
				FatorUnid2 = 39.3701;
				break;
			case "Milha Náutica":
				FatorUnid2 = 0.000539957;
				break;
			}
			break;
//Consumo de Combustível----------------------------------------------------------------------------------------
		case "Consumo de Combustível":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);
			// Fator
			// 1----------------------------------------------------------------------------------------
			switch (Unidade1) { // divide para unid Km/l
			case "Quilômetro por Litro":
				FatorUnid1 = 1;
				break;
			case "Milha por galão americano":
				FatorUnid1 = 2.35215;
				break;
			case "Milha por galão imperial":
				FatorUnid1 = 2.82481;
				break;
			case "Litro por 100 quilômetros":
				// FatorUnid1 = 1;
				FatorUnid1 = valorConverter * (valorConverter / 100);
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // multiplica km/l para ...
			case "Quilômetro por Litro":
				FatorUnid2 = 1;
				break;
			case "Milha por galão americano":
				FatorUnid2 = 2.35215;
				break;
			case "Milha por galão imperial":
				FatorUnid2 = 2.82481;
				break;
			case "Litro por 100 quilômetros":
				// FatorUnid2 = 100;
				FatorUnid2 = valorConverter * (valorConverter / 100);
				break;
			}
			break;
//Energia Mecânica----------------------------------------------------------------------------------------
		case "Energia Mecânica":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);
			// Fator
			// 1----------------------------------------------------------------------------------------
			switch (Unidade1) { // divide por FatorUnid1 converte para Metro
			case "Joule":
				FatorUnid1 = 1;
				break;
			case "Quilojoule":
				FatorUnid1 = 0.001;
				break;
			case "Gram calorie":
				FatorUnid1 = 0.239005736;
				break;
			case "Quilocaloria":
				FatorUnid1 = 0.000239006;
				break;
			case "Watt-hora":
				FatorUnid1 = 0.000277778;
				break;
			case "Quilowatt-hora":
				FatorUnid1 = 2.77778E-07;
				break;
			case "Elétron-volt":
				FatorUnid1 = 6.242e+18;
				break;
			case "Unidade térmica britânica":
				FatorUnid1 = 0.000947867;
				break;
			case "therm (US)":
				FatorUnid1 = 9.47867E-09;
				break;
			case "Pé-libra força":
				FatorUnid1 = 0.737463127;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // divide por FatorUnid2 converte de Metro para ...
			case "Joule":
				FatorUnid2 = 1;
				break;
			case "Quilojoule":
				FatorUnid2 = 0.001;
				break;
			case "Gram calorie":
				FatorUnid2 = 0.239006;
				break;
			case "Quilocaloria":
				FatorUnid2 = 0.000239006;
				break;
			case "Watt-hora":
				FatorUnid2 = 0.000277778;
				break;
			case "Quilowatt-hora":
				FatorUnid2 = 2.7778e-7;
				break;
			case "Elétron-volt":
				FatorUnid2 = 6.242e+18;
				break;
			case "Unidade térmica britânica":
				FatorUnid2 = 0.000947817;
				break;
			case "therm (US)":
				FatorUnid2 = 9.4804e-9;
				break;
			case "Pé-libra força":
				FatorUnid2 = 0.737562;
				break;
			}
			break;
//Frequência----------------------------------------------------------------------------------------
			//"Hertz","Quilo-hertz","Mega-hertz","Gigahertz"
		case "Frequência":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);
			// Fator
			// 1----------------------------------------------------------------------------------------

			switch (Unidade1) { // divide por FatorUnid1 converte para Metro
			case "Hertz":
				FatorUnid1 = 1;
				break;
			case "Quilo-hertz":
				FatorUnid1 = 0.001;
				break;
			case "Mega-hertz":
				FatorUnid1 = 1e-6;
				break;
			case "Gigahertz":
				FatorUnid1 = 1e-9;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // divide por FatorUnid2 converte de Metro para ...
			case "Hertz":
				FatorUnid2 = 1;
				break;
			case "Quilo-hertz":
				FatorUnid2 = 0.001;
				break;
			case "Mega-hertz":
				FatorUnid2 = 1e-6;
				break;
			case "Gigahertz":
				FatorUnid2 = 1e-9;
				break;
			}
			break;
//Massa----------------------------------------------------------------------------------------
		case "Massa":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);
			// Fator
			// 1----------------------------------------------------------------------------------------

			switch (Unidade1) { // divide por FatorUnid1 converte para Metro
			case "Tonelada métrica":
				FatorUnid1 = 0.000001;
				break;
			case "Quilograma":
				FatorUnid1 = 0.001;
				break;
			case "Grama":
				FatorUnid1 = 1; ;
			case "Miligrama":
				FatorUnid1 = 1000;
				break;
			case "Micrograma":
				FatorUnid1 = 1e+6;
				break;
			case "Tonelada de deslocamento":
				FatorUnid1 = 9.84252E-07;
				break;
			case "Tonelada curta":
				FatorUnid1 = 1.10229E-06;
				break;
			case "Stone":
				FatorUnid1 = 0.00015748;
				break;
			case "Libra":
				FatorUnid1 = 0.002204586;
				break;
			case "Onça":
				FatorUnid1 = 0.035273369;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // divide por FatorUnid2 converte de Metro para ...
			case "Tonelada métrica":
				FatorUnid2 = 1e-6;
				break;
			case "Quilograma":
				FatorUnid2 = 0.001;
				break;
			case "Grama":
				FatorUnid2 = 1;
				break;
			case "Miligrama":
				FatorUnid2 = 1000;
				break;
			case "Micrograma":
				FatorUnid2 = 1e+6;
				break;
			case "Tonelada de deslocamento":
				FatorUnid2 = 9.84207e-7;
				break;
			case "Tonelada curta":
				FatorUnid2 = 1.1023e-6;
				break;
			case "Stone":
				FatorUnid2 = 0.000157473;
				break;
			case "Libra":
				FatorUnid2 = 0.00220462;
				break;
			case "Onça":
				FatorUnid2 = 0.035274;
				break;
			}
			break;
//Pressão----------------------------------------------------------------------------------------
			
		case "Pressão":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);

			// Fator
			// 1----------------------------------------------------------------------------------------

			switch (Unidade1) { // divide por 
			case "Atmosfera":
				FatorUnid1 = 1;
				break;
			case "Bar":
				FatorUnid1 = 1.01325;
				break;
			case "Pascal":
				FatorUnid1 = 101325;
				break;
			case "PSI":
				FatorUnid1 = 14.6959;
				break;
			case "Torr":
				FatorUnid1 = 760;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // multiplica por  ...
			case "Atmosfera":
				FatorUnid2 = 1;
				break;
			case "Bar":
				FatorUnid2 = 1.01325;
				break;
			case "Pascal":
				FatorUnid2 = 101325;
				break;
			case "PSI":
				FatorUnid2 = 14.6959;
				break;
			case "Torr":
				FatorUnid2 = 760;
				break;
			}
			break;
//Temperatura----------------------------------------------------------------------------------------
			
		case "Temperatura":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);

			// Fator
			// 1----------------------------------------------------------------------------------------

			switch (Unidade1) { // divide por 
			case "Grau Celsius":
				FatorUnid1 = 1;
				break;
			case "Grau Fahrenheit":
				valorConverter = (valorConverter-32)*5/9;
				FatorUnid1=1;
				break;
			case "Kelvin":
				valorConverter = valorConverter-273.15;
				FatorUnid1 = 1;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // divide por FatorUnid2 converte de Metro para ...
			case "Grau Celsius":
				FatorUnid2 = 1;
				break;
			case "Grau Fahrenheit":
				valorConverter = (valorConverter*9/5)+32;
				FatorUnid2 = 1;
				break;
			case "Kelvin":
				valorConverter = (valorConverter+273.15);
				FatorUnid2 = 1;
				break;
			}
			break;
//Tempo----------------------------------------------------------------------------------------
			
//			"Nanosegundo","Microssegundo","Milissegundo",
//			"Segundo","Minuto","Hora","Dia","Semana","Mês","Ano-calendário",
//			"Década","Século"
			
		case "Tempo":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);

			// Fator
			// 1----------------------------------------------------------------------------------------

			switch (Unidade1) { // divide por FatorUnid1 converte para Metro
			case "Nanosegundo":
				FatorUnid1 = 3.154e+18;
				break;
			case "Microssegundo":
				FatorUnid1 = 3.154e+15;
				break;
			case "Milissegundo":
				FatorUnid1 = 3.154e+12;
				break;
			case "Segundo":
				FatorUnid1 = 3.154e+9;
				break;
			case "Minuto":
				FatorUnid1 = 5.256e+7;
				break;
			case "Hora":
				FatorUnid1 = 876000;
				break;
			case "Dia":
				FatorUnid1 = 36500;
				break;
			case "Semana":
				FatorUnid1 = 5214;
				break;
			case "Mês":
				FatorUnid1 = 1200;
				break;
			case "Ano-calendário":
				FatorUnid1 = 100;
				break;
			case "Década":
				FatorUnid1 = 10;
				break;
			case "Século":
				FatorUnid1 = 1;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // divide por FatorUnid2 converte de Metro para ...
			case "Nanosegundo":
				FatorUnid2 = 3.154e+18;
				break;
			case "Microssegundo":
				FatorUnid2 = 3.154e+15;
				break;
			case "Milissegundo":
				FatorUnid2 = 3.154e+12;
				break;
			case "Segundo":
				FatorUnid2 = 3.154e+9;
				break;
			case "Minuto":
				FatorUnid2 = 5.256e+7;
				break;
			case "Hora":
				FatorUnid2 = 876000;
				break;
			case "Dia":
				FatorUnid2 = 36500;
				break;
			case "Semana":
				FatorUnid2 = 5214;
				break;
			case "Mês":
				FatorUnid2 = 1200;
				break;
			case "Ano-calendário":
				FatorUnid2 = 100;
				break;
			case "Década":
				FatorUnid2 = 10;
				break;
			case "Século":
				FatorUnid2 = 1;
				break;
			}
			break;
//Transmissão de Dados----------------------------------------------------------------------------------------
//		
//		case "Transmissão de Dados":
//			System.out.println("Grupo de Unidades = " + GrupoUnidade);
//
//			// Fator
//			// 1----------------------------------------------------------------------------------------
//
//			switch (Unidade1) { // divide por FatorUnid1 converte para Metro
//			case "Quilômetro":
//				FatorUnid1 = 0.001;
//				break;
//			}
//			// Fator
//			// 2----------------------------------------------------------------------------------------
//			switch (Unidade2) { // divide por FatorUnid2 converte de Metro para ...
//			case "Quilômetro":
//				FatorUnid2 = 0.001;
//				break;
//			}
//			break;
//Velocidade----------------------------------------------------------------------------------------
			
		case "Velocidade":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);

			// Fator
			// 1----------------------------------------------------------------------------------------

			switch (Unidade1) { // divide por FatorUnid1 converte para Metro
			case "Milha por hora":
				FatorUnid1 = 2.237;
				break;
			case "Pés por segundo":
				FatorUnid1 = 3.281;
				break;
			case "Metro por segundo":
				FatorUnid1 = 1;
				break;
			case "Quilômetro por hora":
				FatorUnid1 = 3.6;
				break;
			case "Nó":
				FatorUnid1 = 1.944;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // divide por FatorUnid2 converte de Metro para ...
			case "Milha por hora":
				FatorUnid2 = 2.237;
				break;
			case "Pés por segundo":
				FatorUnid2 = 3.281;
				break;
			case "Metro por segundo":
				FatorUnid2 = 1;
				break;
			case "Quilômetro por hora":
				FatorUnid2 = 3.6;
				break;
			case "Nó":
				FatorUnid2 = 1.944;
				break;
			}
//Volume----------------------------------------------------------------------------------------
//			"Galão americano","Quarto líquido americano",
//			"Pinta americana","Copo","Onça líquida americana","Colher de sopa americana",
//			"Colher de chá americana","Metro cúbico","Litro","Mililitro",
//			"Galão Imperial","Quarto imperial","Pinto imperial","Xícara Imperial",
//			"Onça líquida imperial","Colher de sopa Imperial","Colher de chá Imperial",
//			"Pé cúbico","Polegada cúbica"
			
		case "Volume":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);

			// Fator
			// 1----------------------------------------------------------------------------------------

			switch (Unidade1) { // divide por FatorUnid1 converte para Metro3
			case "Galão americano":
				FatorUnid1 = 264.172;
				break;
			case "Quarto líquido americano":
				FatorUnid1 = 1056.69;
				break;
			case "Pinta americana":
				FatorUnid1 = 2113.38;
				break;
			case "Copo":
				FatorUnid1 = 4166.67;
				break;
			case "Onça líquida americana":
				FatorUnid1 = 33814;
				break;
			case "Colher de sopa americana":
				FatorUnid1 = 67628;
				break;
			case "Colher de chá americana":
				FatorUnid1 = 202884;
				break;
			case "Metro cúbico":
				FatorUnid1 = 1;
				break;
			case "Litro":
				FatorUnid1 = 1000;
				break;
			case "Mililitro":
				FatorUnid1 = 1e+6;
				break;
			case "Galão Imperial":
				FatorUnid1 = 219.969;
				break;
			case "Quarto imperial":
				FatorUnid1 = 879.877;
				break;
			case "Pinto imperial":
				FatorUnid1 = 1759.75;
				break;
			case "Xícara Imperial":
				FatorUnid1 = 3519.51;
				break;
			case "Onça líquida imperial":
				FatorUnid1 = 35195.1;
				break;
			case "Colher de sopa Imperial":
				FatorUnid1 = 56312.1;
				break;
			case "Colher de chá Imperial":
				FatorUnid1 = 168936;
				break;
			case "Pé cúbico":
				FatorUnid1 = 35.3147;
				break;
			case "Polegada cúbica":
				FatorUnid1 = 61023.7;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // divide por FatorUnid2 converte de Metro para ...
			case "Galão americano":
				FatorUnid2 = 264.172;
				break;
			case "Quarto líquido americano":
				FatorUnid2 = 1056.69;
				break;
			case "Pinta americana":
				FatorUnid2 = 2113.38;
				break;
			case "Copo":
				FatorUnid2 = 4166.67;
				break;
			case "Onça líquida americana":
				FatorUnid2 = 33814;
				break;
			case "Colher de sopa americana":
				FatorUnid2 = 67628;
				break;
			case "Colher de chá americana":
				FatorUnid2 = 202884;
				break;
			case "Metro cúbico":
				FatorUnid2 = 1;
				break;
			case "Litro":
				FatorUnid2 = 1000;
				break;
			case "Mililitro":
				FatorUnid2 = 1e+6;
				break;
			case "Galão Imperial":
				FatorUnid2 = 219.969;
				break;
			case "Quarto imperial":
				FatorUnid2 = 879.877;
				break;
			case "Pinto imperial":
				FatorUnid2 = 1759.75;
				break;
			case "Xícara Imperial":
				FatorUnid2 = 3519.51;
				break;
			case "Onça líquida imperial":
				FatorUnid2 = 35195.1;
				break;
			case "Colher de sopa Imperial":
				FatorUnid2 = 56312.1;
				break;
			case "Colher de chá Imperial":
				FatorUnid2 = 168936;
				break;
			case "Pé cúbico":
				FatorUnid2 = 35.3147;
				break;
			case "Polegada cúbica":
				FatorUnid2 = 61023.7;
				break;
			}
			break;
//Área----------------------------------------------------------------------------------------
			
			
		case "Área":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);

			// Fator
			// 1----------------------------------------------------------------------------------------

			switch (Unidade1) { // divide por FatorUnid1 converte para Milha2
			case "Quilômetro quadrado":
				FatorUnid1 = 2.58999;
				break;
			case "Metro quadrado":
				FatorUnid1 = 2.58999e+6;
				break;
			case "Milha quadrada":
				FatorUnid1 = 1;
				break;
			case "Jarda quadrada":
				FatorUnid1 = 3.098e+6;
				break;
			case "Pé quadrado":
				FatorUnid1 = 2.788e+7;
				break;
			case "Polegada quadrada":
				FatorUnid1 = 4.014e+9;
				break;
			case "Hectare":
				FatorUnid1 = 258.999;
				break;
			case "Acre":
				FatorUnid1 = 640;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // divide por FatorUnid2 converte de Metro para ...
			case "Quilômetro quadrado":
				FatorUnid2 = 2.58999;
				break;
			case "Metro quadrado":
				FatorUnid2 = 2.58999e+6;
				break;
			case "Milha quadrada":
				FatorUnid2 = 1;
				break;
			case "Jarda quadrada":
				FatorUnid2 = 3.098e+6;
				break;
			case "Pé quadrado":
				FatorUnid2 = 2.788e+7;
				break;
			case "Polegada quadrada":
				FatorUnid2 = 4.014e+9;
				break;
			case "Hectare":
				FatorUnid2 = 258.999;
				break;
			case "Acre":
				FatorUnid2 = 640;
				break;
			}
			break;
//Ângulo----------------------------------------------------------------------------------------
			
//			"Grado","Grau","Mil angular","Minuto de arco",
//			"Radiano","Segundo de arco"
			
		case "Ângulo":
			System.out.println("Grupo de Unidades = " + GrupoUnidade);

			// Fator
			// 1----------------------------------------------------------------------------------------

			switch (Unidade1) { // divide por FatorUnid1 converte para Radiano
			case "Grado":
				FatorUnid1 = 200*Math.PI;
				break;
			case "Grau":
				FatorUnid1 = 180*Math.PI;
				break;
			case "Mil angular":
				FatorUnid1 = 1000;
				break;
			case "Minuto de arco":
				FatorUnid1 = (60*180)*Math.PI;
				break;
			case "Radiano":
				FatorUnid1 = 1;
				break;
			case "Segundo de arco":
				FatorUnid1 = (180*3600)*Math.PI;
				break;
			}
			// Fator
			// 2----------------------------------------------------------------------------------------
			switch (Unidade2) { // divide por FatorUnid2 converte de Metro para ...
			case "Grado":
				FatorUnid2 = 200/Math.PI;
				break;
			case "Grau":
				FatorUnid2 = 180/Math.PI;
				break;
			case "Mil angular":
				FatorUnid2 = 1000;
				break;
			case "Minuto de arco":
				FatorUnid2 = (60*180)/Math.PI;
				break;
			case "Radiano":
				FatorUnid2 = 1;
				break;
			case "Segundo de arco":
				FatorUnid2 = (180*3600)/Math.PI;
				break;
			}
			break;
//Espaço para Novas Unidades

//Modelo----------------------------------------------------------------------------------------
//					case "Modelo":
//						System.out.println("Grupo de Unidades = " + GrupoUnidade);
//
//						//Fator 1----------------------------------------------------------------------------------------
//
//						switch (Unidade1) { // divide por FatorUnid1 converte ...
//						case "xxxx":
//							FatorUnid1 = 0.001;
//							break;
//						}
//						//Fator 2----------------------------------------------------------------------------------------
//						switch (Unidade2) { // divide por FatorUnid2 para ...
//						case "xxx":
//							FatorUnid2 = 0.001;
//							break;
//						}
//					break;
		}
//Cálculo Final----------------------------------------------------------------------------------------
		System.out.println("Cálculo Final!!!");
		//Fator = FatorUnid1 * FatorUnid2;
		//System.out.println("Fator = " + Fator);

		// return valorConverter / Fator; //Precisa corrigir para a parte de
		// Armazenamento de Dados
		return valorConverter / FatorUnid1 * FatorUnid2;

	}

}
