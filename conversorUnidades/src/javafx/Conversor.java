package javafx;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Conversor extends Application{
	
	public String teste = null;

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Conversor de Unidades");

		// Menu de tipos de conversões
		ComboBox<String> comboBox = new ComboBox<>();
		comboBox.getItems().addAll("Armazenamento de dados", "Comprimento", "Consumo de Combustível",
				"Energia Mecânica", "Frequência", "Massa", "Pressão", "Temperatura", "Tempo", "Transmissão de Dados",
				"Velocidade", "Volume", "Área", "Ângulo");

		// Criando um TextField
		TextField textField = new TextField();
		textField.setAlignment(Pos.BASELINE_CENTER);

		TextField textField2 = new TextField("1");
		textField2.setPrefColumnCount(19);
		textField2.setAlignment(Pos.BASELINE_CENTER);

		TextField textField3 = new TextField();
		textField3.setPrefColumnCount(19);
		textField3.setId("TextFinal");
		textField3.setAlignment(Pos.BASELINE_CENTER);
		textField3.setEditable(false);
		ComboBox<String> comboBoxUnid1 = new ComboBox<>();
		ComboBox<String> comboBoxUnid2 = new ComboBox<>();

		// Adicione um listener ao ComboBox para atualizar o TextField
		comboBox.setOnAction(event -> {
			final String selectedItem = comboBox.getSelectionModel().getSelectedItem();
			textField.setText(selectedItem);

			// Menu de UNIDADES

			comboBoxUnid1.getItems().clear(); //limpa os dados do Combo Unid1
			comboBoxUnid2.getItems().clear(); //limpa os dados do Combo Unid2
//Armazenamento de Dados			
			if (selectedItem == "Armazenamento de dados") {
				comboBoxUnid1.getItems().addAll("Bit", "Kilobit", "Kibibit", "Megabit", "Mebibit", "Gigabit", "Gibibit",
						"Terabit", "Tebibit", "Petabit", "Pebibit", "Byte", "Kilobyte", "Kibibyte", "Megabyte",
						"MebiByte", "Gigabyte", "Gibibyte", "Terabyte", "Tebibyte", "Petabyte", "Pebibyte");
				comboBoxUnid2.getItems().addAll("Bit", "Kilobit", "Kibibit", "Megabit", "Mebibit", "Gigabit", "Gibibit",
						"Terabit", "Tebibit", "Petabit", "Pebibit", "Byte", "Kilobyte", "Kibibyte", "Megabyte",
						"MebiByte", "Gigabyte", "Gibibyte", "Terabyte", "Tebibyte", "Petabyte", "Pebibyte");
			}
//Comprimento			
			else if(selectedItem == "Comprimento") {
				comboBoxUnid1.getItems().addAll(
						"Quilômetro", "Metro", "Centímetro", "Milímetro", "Micrômetro", "Nanômetro",
						"Milha", "Jarda","Pé", "Polegada", "Milha Náutica");
				comboBoxUnid2.getItems().addAll(
						"Quilômetro", "Metro", "Centímetro", "Milímetro", "Micrômetro", "Nanômetro",
						"Milha", "Jarda","Pé", "Polegada", "Milha Náutica");
			}
//Consumo de Combustível
			else if(selectedItem == "Consumo de Combustível") {
				comboBoxUnid1.getItems().addAll("Quilômetro por Litro","Milha por galão americano",
						"Milha por galão imperial","Litro por 100 quilômetros");
				comboBoxUnid2.getItems().addAll("Quilômetro por Litro","Milha por galão americano",
						"Milha por galão imperial","Litro por 100 quilômetros");
			}
//Energia Mecânica
			else if(selectedItem == "Energia Mecânica") {
				comboBoxUnid1.getItems().addAll("Joule","Quilojoule","Gram calorie","Quilocaloria",
						"Watt-hora","Quilowatt-hora","Elétron-volt","Unidade térmica britânica", 
						"therm (US)","Pé-libra força");
				comboBoxUnid2.getItems().addAll("Joule","Quilojoule","Gram calorie","Quilocaloria",
						"Watt-hora","Quilowatt-hora","Elétron-volt","Unidade térmica britânica", 
						"therm (US)","Pé-libra força");
			}
//Frequência
			else if(selectedItem == "Frequência") {
				comboBoxUnid1.getItems().addAll("Hertz","Quilo-hertz","Mega-hertz","Gigahertz");
				comboBoxUnid2.getItems().addAll("Hertz","Quilo-hertz","Mega-hertz","Gigahertz");
			}
//Massa
			else if(selectedItem == "Massa") {
				comboBoxUnid1.getItems().addAll("Tonelada métrica","Quilograma","Grama","Miligrama",
						"Micrograma","Tonelada de deslocamento","Tonelada curta","Stone","Libra",
						"Onça");
				comboBoxUnid2.getItems().addAll("Tonelada métrica","Quilograma","Grama","Miligrama",
						"Micrograma","Tonelada de deslocamento","Tonelada curta","Stone","Libra",
						"Onça");
			}
//Pressão
			else if(selectedItem == "Pressão") {
				comboBoxUnid1.getItems().addAll("Atmosfera", "Bar", "Pascal", "PSI", "Torr");
				comboBoxUnid2.getItems().addAll("Atmosfera", "Bar", "Pascal", "PSI", "Torr");
			}
//Temperatura
			else if(selectedItem == "Temperatura") {
				comboBoxUnid1.getItems().addAll("Grau Celsius", "Grau Fahrenheit","Kelvin");
				comboBoxUnid2.getItems().addAll("Grau Celsius", "Grau Fahrenheit","Kelvin");
			}
//Tempo
			else if(selectedItem == "Tempo") {
				comboBoxUnid1.getItems().addAll("Nanosegundo","Microssegundo","Milissegundo",
						"Segundo","Minuto","Hora","Dia","Semana","Mês","Ano-calendário",
						"Década","Século");
				comboBoxUnid2.getItems().addAll("Nanosegundo","Microssegundo","Milissegundo",
						"Segundo","Minuto","Hora","Dia","Semana","Mês","Ano-calendário",
						"Década","Século");
			}
//Transmissão de Dados
//			else if(selectedItem == "Transmissão de Dados") {
//				comboBoxUnid1.getItems().addAll("Bit por segundo","Quilobit por segundo",
//						"Quilobyte por segundo","Kibibit por segundo","Megabit por segundo",
//						"Megabyte por segundo","Mebibit por segundo","Gigabit por segundo",
//						"Gigabyte por segundo","Gibibit por segundo","Terabit por segundo",
//						"Terabyte por segundo","Tebibit por segundo");
//				comboBoxUnid2.getItems().addAll("Bit por segundo","Quilobit por segundo",
//						"Quilobyte por segundo","Kibibit por segundo","Megabit por segundo",
//						"Megabyte por segundo","Mebibit por segundo","Gigabit por segundo",
//						"Gigabyte por segundo","Gibibit por segundo","Terabit por segundo",
//						"Terabyte por segundo","Tebibit por segundo");
//			}
//Velocidade
			else if(selectedItem == "Velocidade") {
				comboBoxUnid1.getItems().addAll("Milha por hora", "Pés por segundo",
						"Metro por segundo","Quilômetro por hora","Nó");
				comboBoxUnid2.getItems().addAll("Milha por hora", "Pés por segundo",
						"Metro por segundo","Quilômetro por hora","Nó");
				
			}
//Volume
			else if(selectedItem == "Volume") {
				comboBoxUnid1.getItems().addAll("Galão americano","Quarto líquido americano",
						"Pinta americana","Copo","Onça líquida americana","Colher de sopa americana",
						"Colher de chá americana","Metro cúbico","Litro","Mililitro",
						"Galão Imperial","Quarto imperial","Pinto imperial","Xícara Imperial",
						"Onça líquida imperial","Colher de sopa Imperial","Colher de chá Imperial",
						"Pé cúbico","Polegada cúbica");
				comboBoxUnid2.getItems().addAll("Galão americano","Quarto líquido americano",
						"Pinta americana","Copo","Onça líquida americana","Colher de sopa americana",
						"Colher de chá americana","Metro cúbico","Litro","Mililitro",
						"Galão Imperial","Quarto imperial","Pinto imperial","Xícara Imperial",
						"Onça líquida imperial","Colher de sopa Imperial","Colher de chá Imperial",
						"Pé cúbico","Polegada cúbica");
			}
//Área
			else if(selectedItem == "Área") {
				comboBoxUnid1.getItems().addAll("Quilômetro quadrado","Metro quadrado","Milha quadrada",
						"Jarda quadrada","Pé quadrado","Polegada quadrada","Hectare","Acre");
				comboBoxUnid2.getItems().addAll("Quilômetro quadrado","Metro quadrado","Milha quadrada",
						"Jarda quadrada","Pé quadrado","Polegada quadrada","Hectare","Acre");
				
			}
//Ângulo
			else if(selectedItem == "Ângulo") {
				comboBoxUnid1.getItems().addAll("Grado","Grau","Mil angular","Minuto de arco",
						"Radiano","Segundo de arco");
				comboBoxUnid2.getItems().addAll("Grado","Grau","Mil angular","Minuto de arco",
						"Radiano","Segundo de arco");
			}
			
			
//Modelo
//			else if(selectedItem == "Modelo") {
//				comboBoxUnid1.getItems().addAll(
//						);
//				comboBoxUnid2.getItems().addAll(
//						);
//				
//			}
			
			
			
			
			
			
			
			
			
		});

		// Adicionando um listener ao textField2 para atualizar o textField3
		// textField2.

		// Crie um Label
		//Label labelFórmula = new Label("");
		//labelFórmula.setPrefWidth(350);
		
		Label label1 = new Label(" = ");
		//Label labelEspaco = new Label("  ");
		label1.setMinHeight(25); // Defina a altura mínima para o Label
		label1.setAlignment(Pos.BASELINE_CENTER); // Alinhe o texto no centro verticalmente

		// Adicione uma classe CSS ao ComboBox
		comboBox.getStyleClass().add("combo-box");
		comboBoxUnid1.getStyleClass().add("combo-boxUnid");
		comboBoxUnid2.getStyleClass().add("combo-boxUnid");

		// Button opcao1Button = new Button("Opção 1");
		Button converterButton = new Button("Converter");

		// ação ao pressionar o botão Converter
		converterButton.setOnAction(e -> {
			String valor1 = textField2.getText();
			String Unidade1 = comboBoxUnid1.getValue();
			String Unidade2 = comboBoxUnid2.getValue();
			
			
			if (Unidade1 != null || Unidade2 != null) {
				
			
			
			
			ConverterUnidade a1 = new ConverterUnidade(comboBox.getValue(),Double.parseDouble(valor1), 
					comboBoxUnid1.getValue(), comboBoxUnid2.getValue());
			
			double valor2 = a1.ValorFinal();
			System.out.print("ValorFinalA1 = ");
			System.out.println(valor2);
			//System.out.print("Fator = ");
			//System.out.println(a1.Fator);
			
			//double valor2 = a1.ValorFinal(); //ponto de atenção essa situação chamará a função novamente
			//double val1 = Double.valueOf(valor1);
			//double fator = 1/valor2*val1;
			//double fatorFinal = 
			//System.out.println("Valor do Fator:" );
			
			//String formulaTexto = ("Para um resultado aproximado, divida o valor por "+Double.toString(a1.Fator));
			//System.out.println(formulaTexto);
			
			
			//labelFórmula.setPrefWidth(350);
			//labelFórmula.setTextAlignment(TextAlignment.LEFT);
			//labelFórmula.setText(formulaTexto);
			
			DecimalFormatSymbols symbols = new DecimalFormatSymbols();
			symbols.setExponentSeparator("e");
			DecimalFormat df = new DecimalFormat("#.#####E0", symbols);
			
			String ValorFormatado;
			
			if (Math.abs(valor2)< 1e-6  || Math.abs(valor2)>1e6) {
				ValorFormatado = df.format(valor2);
				
			} else {
				ValorFormatado = String.format("%.5f", valor2);
			}
			
			
			//String str = Double.toString(valor2);
			
			System.out.println("valorFormatado = "+ ValorFormatado); // Valor 2
			textField3.setText(ValorFormatado);
			String unidadeSelecionada = comboBox.getValue();
			System.out.println("UnidSelecionada = "+unidadeSelecionada);
			//System.out.println(valor1);
			
			
//			teste = unidadeSelecionada;

			}
		});
		

		// opcao1Button.setOnAction(e -> abrirJanelaCalculo());

		// Crie um HBox para os dois TextFields lado a lado
		HBox hbox = new HBox(0); // O parâmetro 10 define o espaçamento entre os TextFields
		hbox.getChildren().addAll(textField2, label1, textField3);
		hbox.setAlignment(Pos.BASELINE_CENTER);

		// Crie um HBox para os dois ComboBox Unidades lado a lado
		HBox hboxUnid = new HBox(50); // O parâmetro 50 define o espaçamento entre os TextFields
		hboxUnid.getChildren().addAll(comboBoxUnid1, comboBoxUnid2);
		hboxUnid.setAlignment(Pos.BASELINE_CENTER);

		VBox vbox = new VBox(10, comboBox, hbox, hboxUnid, converterButton);
		vbox.setPadding(new Insets(10));
		vbox.setAlignment(Pos.BASELINE_CENTER); // Centraliza o HBox verticalmente na janela

		Scene scene = new Scene(vbox, 700, 250);
		primaryStage.setScene(scene);
		primaryStage.show();

		// Adicione o arquivo CSS à cena
		scene.getStylesheets().add("styles.css");
		
		
		String unidadeSelecionada = comboBox.getValue();
		String valor1 = textField2.getText();
		System.out.println(unidadeSelecionada);
		System.out.println(valor1);
	}
	
	
	

//	private void abrirJanelaCalculo() {
//		Stage janelaCalculo = new Stage();
//		janelaCalculo.setTitle("Cálculo da Circunferência");
//
//		Label raioLabel = new Label("Insira o valor do raio:");
//		TextField raioTextField = new TextField();
//		Button calcularButton = new Button("Calcular");
//
//		Label resultadoLabel = new Label();
//
//		calcularButton.setOnAction(e -> {
//			try {
//				double raio = Double.parseDouble(raioTextField.getText());
//				double area = Math.PI * Math.pow(raio, 2);
//				double perimetro = 2 * Math.PI * raio;
//				resultadoLabel.setText(String.format("Área: %.2f\nPerímetro: %.2f", area, perimetro));
//			} catch (NumberFormatException ex) {
//				resultadoLabel.setText("Por favor, insira um número válido.");
//			}
//		});
//
//		VBox vbox = new VBox(10, raioLabel, raioTextField, calcularButton, resultadoLabel);
//		vbox.setPadding(new Insets(10));
//
//		Scene scene = new Scene(vbox, 300, 200);
//		janelaCalculo.setScene(scene);
//		janelaCalculo.show();
//	}

	public static void main(String[] args) {
		launch(args);
	}
}
