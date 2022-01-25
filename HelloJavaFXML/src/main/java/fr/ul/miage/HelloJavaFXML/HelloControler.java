package fr.ul.miage.HelloJavaFXML;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class HelloControler {
	
	@FXML
	private Button btn;
	@FXML
	private TextArea ta;
	@FXML
	void sayHello() {
		ta.appendText("Hello world!\n");
	}

}
