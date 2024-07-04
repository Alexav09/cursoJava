package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class primeiroFX extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		Button botaoA = new Button("A");
		Button botaoB = new Button("B");
		Button botaoC = new Button("C");
		
		VBox box = new VBox();
		box.setSpacing(20);
		//box.snapPositionX(100);//não acontece nada com os botões
		//box.setAlignment(Pos.BASELINE_CENTER);//Alinha centralizando na horizontal
		box.setAlignment(Pos.CENTER); //entraliza em todas os eixos
		box.getChildren().add(botaoA);
		box.getChildren().add(botaoB);
		box.getChildren().add(botaoC);
		
		
		
		Scene cena = new Scene(box, 200, 200);
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

}
