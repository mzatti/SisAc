package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("../view/Login.fxml"));
            //Carregou o layout raiz
			AnchorPane root = (AnchorPane) loader.load();
			
			Scene scene = new Scene(root,600,400);
			primaryStage.setScene(scene);
			primaryStage.show();
			this.criarBanco();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void criarBanco(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence");
	    factory.close();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

