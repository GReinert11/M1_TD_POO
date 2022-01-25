package fr.ul.miage.HelloJavaFxmlPlus;

import java.io.File;
import java.io.IOException;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class HelloControler {
	public File file = null;
	@FXML
	private Button btn;
	@FXML
	private Button btn_fichier;
	@FXML
	private TextArea ta;
	@FXML
	void get_fichier() {
		Stage st = new Stage();
		
		  FileChooser fileChooser = new FileChooser();
  
        file = fileChooser.showOpenDialog(st);
        System.out.println(file);
        
		
	}
	@FXML
	void sayHello() {
	
		
		

		
		getCSV g = new getCSV(file);
	
	        try {
	            CSVParser p = g.buildCVSParser();
	            for(CSVRecord r : p) {
	                String nom = r.get(0);
	                String prenom = r.get(1);
	                System.out.println("Hello "+nom+" "+prenom+" !");
	                ta.appendText("Hello " + nom + " " + prenom + " ! \n");
	            }
	        }catch(IOException e) {
	            
	        }
		
	}
	
	
	

}
