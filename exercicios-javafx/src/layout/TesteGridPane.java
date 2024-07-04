package layout;

import javafx.geometry.Insets;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

public class TesteGridPane extends GridPane {

	public TesteGridPane() {

		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");

		setGridLinesVisible(true);// determina se as linhas de grade serão ou não exibidas

		getColumnConstraints().addAll(cc(), cc(), fcc(), cc(), cc()); // nessa estrutura a coluna do meio possui uma
																		// largura fixa conforme fcc
		getRowConstraints().addAll(rc(), rc(), rc(), rc(), rc());

		setVgap(10);
		setHgap(10);
		setPadding(new Insets(10)); //cria um espaço entre o GridPane e a janela

		add(c1, 0, 0); // irá acrescentar a caixa c1 na coluna 0 e linha 0
		add(c2, 1, 1, 2, 3);// irá acrescentar a caixa c2 na coluna 2 e linha 1, mesclando as 2 colunas e 3
							// linhas
		add(c3, 4, 2, 1, 3);
		add(c4, 3, 1);
		add(c5, 0, 4, 2, 1);
		add(c6, 3, 3);

	}

	public ColumnConstraints cc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setPercentWidth(20);
		cc.setFillWidth(true);
		return cc;

	}

	public ColumnConstraints fcc() {
		ColumnConstraints cc = new ColumnConstraints();
		cc.setMinWidth(200);
		cc.setMaxWidth(200);
		cc.setFillWidth(true);
		return cc;

	}

	public RowConstraints rc() {
		RowConstraints rc = new RowConstraints();
		rc.setPercentHeight(20);
		rc.setFillHeight(true);
		return rc;
	}

}
