package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.stage.Stage;

public abstract class AbstractController  implements Initializable{
	protected Stage stage;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {	}	

	/**
	 * Método que cria o vinculo do 
	 * Estágio da aplicação
	 * permitindo troca de scenas.
	 *  
	 * @param Stage stage
	 */
	public void setStage(Stage stage){
		this.stage = stage;
	}
}
