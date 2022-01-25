package fr.ul.miage.HelloJavaFXML;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Logger;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;


public class getCSV {
	
	 private static final Logger LOG = Logger.getLogger(App.class.getName());
	    //attributs
	    private File filename;
	    //constructeur
	    public getCSV(File filename) {
	        setFilename(filename);
	    }
	    
	    //setters et getters
	    public File getFilename() {
	        return filename;
	    }


	    public void setFilename(File filename2) {
	        this.filename = filename2;
	    }
	    
	    public CSVParser buildCVSParser() throws IOException{
	        CSVParser res = null;
	        Reader in;
	        in = new FileReader(filename);
	        CSVFormat csvf = CSVFormat.DEFAULT.withCommentMarker('#').withDelimiter(';');
	        res = new CSVParser(in, csvf);
	        return res;
	    }

}
