package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {
	public TesteStackPane() {

		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");

		getChildren().addAll(c2, c3, c4, c5, c6, c1);

		setOnMouseClicked(e -> {
			// System.out.println("Click");

			/*
			 * //para testarmos em que lado o usuário está clicando o mouse temos
			 * if(e.getSceneX() > getScene().getWidth()/2) { System.out.println("direito");
			 * } else { System.out.println("esquerdo"); }
			 */

			if (e.getSceneX() > getScene().getWidth() / 2) {
				getChildren().get(0).toFront();// mas para começar com o 1 precisamos colocar ele na última posição
			} else {
				getChildren().get(5).toBack();
			}
		});

		Thread t = new Thread(() -> {
			while (true) {
				try {
					Thread.sleep(3000);
					
					// desta forma abaixo não funciona e dá um erro (Not on FX application thread; currentThread = Thread-3)
					
					//getChildren().get(0).toFront();
					
					//com isso é necessário incluir o código da seguinte forma
					
					Platform.runLater(()->{
						getChildren().get(0).toFront();
						
					});
					
					
				} catch (Exception e) {
					//System.out.println(e.getMessage()); //caso haja interesse em tratar o erro
				}
			}
		});
		t.setDaemon(true);// garante a finalização da aplicação
		t.start();

	}

}
