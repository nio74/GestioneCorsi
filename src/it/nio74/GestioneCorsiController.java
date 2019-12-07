/**
 * Sample Skeleton for 'GestioneCorsi.fxml' Controller Class
 */

package it.nio74;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.nio74.Model.Corso;
import it.nio74.Model.GestoreCorsi;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GestioneCorsiController {
	
	private GestoreCorsi model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;
    
    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="txtPeriodo"
    private TextField txtPeriodo; // Value injected by FXMLLoader

    @FXML // fx:id="btnCercaCorsi"
    private Button btnCercaCorsi; // Value injected by FXMLLoader

    @FXML // fx:id="btnSattCorsi"
    private Button btnSattCorsi; // Value injected by FXMLLoader

    @FXML
    void doCalcolaStatCorsi(ActionEvent event) {

    }

    @FXML
    void doCercaCorsi(ActionEvent event) {
    	
    	int periodo;
    	
    	try {
    		 periodo = Integer.parseInt(txtPeriodo.getText());
    	}catch(NumberFormatException e) {
    		txtResult.appendText("Devi inserire un periodo (1 o 2)");
    		return;
    	}
    	
    	if(periodo != 1 && periodo != 2) {
    		
    		txtResult.appendText("Devi inserire un periodo (1 o 2)");
    		return;
    	}
    	
    	List<Corso> corsi = this.model.getCorsiPeriodo(periodo);
    	
    	for(Corso c : corsi) {
    		
    		txtResult.appendText(c.toString() + "\n");
    	}

    }
    
    

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'GestioneCorsi.fxml'.";
        assert txtPeriodo != null : "fx:id=\"txtPeriodo\" was not injected: check your FXML file 'GestioneCorsi.fxml'.";
        assert btnCercaCorsi != null : "fx:id=\"btnCercaCorsi\" was not injected: check your FXML file 'GestioneCorsi.fxml'.";
        assert btnSattCorsi != null : "fx:id=\"btnSattCorsi\" was not injected: check your FXML file 'GestioneCorsi.fxml'.";

    }
    
    public void setModel(GestoreCorsi model) {
    	this.model = model;
    }
}
