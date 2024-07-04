module AgendaApp {
	requires javafx.controls;
	requires javafx.graphics;
	
	opens com.alexandreveca.agenda to javafx.graphics, javafx.fxml;
}
