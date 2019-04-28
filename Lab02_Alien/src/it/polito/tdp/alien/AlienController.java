package it.polito.tdp.alien;

import java.lang.reflect.Array;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	Dizionario dizionario;
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtInput;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtInput != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	dizionario = new Dizionario();
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	
    	txtResult.clear();
    	
    	if(txtInput.getText().length()==0) {
    		txtResult.appendText("Inserire una parola \n");
    		return;
    		}else {
    			
    			String words[]=this.txtInput.getText().toLowerCase().trim().replace("  ", " ").split(" ");
    			
    			if(words.length==1) {
    				txtResult.setText(words[0] + " ---> " +this.dizionario.CercaParola(words[0]));
    			}else if(words.length==2) {
    				this.dizionario.AggiungiParola(words[0], words[1]);
    				txtResult.setText(words[0] + " aggiunta nel vocabolario");
    			}else {
    				txtResult.setText("inserire una parola da tradurre o aggiungere un vocabolo nuovo");
    				
    			}
    	
    		}
    	    	txtInput.clear();

    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    	txtInput.clear();
    	

    }
    
}
