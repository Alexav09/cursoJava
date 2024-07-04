package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {

		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();

		setHgap(10); // insere espaçamento horizontal entre os quadrados
		setVgap(10); // insere espaçamento vertical entre os quadrados
		setPadding(new Insets(10)); // insere uma margem entre ops quadrados e a borda da janela
		setOrientation(Orientation.HORIZONTAL); // define qual será a orientação dos quadrados, Horizontal ou Vertical
		setAlignment(Pos.BOTTOM_RIGHT); // define qual será o alinhamento dos quadrados em relação à Janela

		getChildren().addAll(q1, q2, q3, q4, q5);

	}

}
