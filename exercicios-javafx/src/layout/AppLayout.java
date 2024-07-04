package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		

		// VBox temp = new VBox();

		// testando com a caixa
		/*
		 * temp.getChildren().add(new Caixa().comTexto("1")); temp.getChildren().add(new
		 * Caixa().comTexto("2")); temp.getChildren().add(new Caixa().comTexto("3"));
		 * temp.getChildren().add(new Caixa().comTexto("4")); temp.getChildren().add(new
		 * Caixa().comTexto("5")); temp.getChildren().add(new Caixa().comTexto("6"));
		 * temp.getChildren().add(new Caixa().comTexto("7"));
		 */
		// testando agora com o Quadrado
		/*
		 * temp.getChildren().add(new Quadrado()); temp.getChildren().add(new
		 * Quadrado()); temp.getChildren().add(new Quadrado());
		 * temp.getChildren().add(new Quadrado()); temp.getChildren().add(new
		 * Quadrado()); temp.getChildren().add(new Quadrado());
		 * temp.getChildren().add(new Quadrado());
		 * 
		 * 
		 * 
		 * 
		 * Scene principal = new Scene(temp, 800,2600);
		 * 
		 * primaryStage.setScene(principal);
		 */

		Parent raiz = null;
		// nesse caso o sistema sempre irá utilizar o último item do Parent, pois na
		// Linha do Scene principal o último valor é o que será utilizado
//		raiz = new TesteAnchorPane();
//		raiz = new TesteBorderPane();
//		raiz = new TesteFlowPane();
//		raiz = new TesteGridPane();
//		raiz = new TesteStackPane();
		raiz = new TesteTilePane();
		
		
		

		Scene principal = new Scene(raiz, 800, 600);

		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
