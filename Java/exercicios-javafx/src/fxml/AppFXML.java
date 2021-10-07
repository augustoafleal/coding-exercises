package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AppFXML extends Application {
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		// Importanto CSS
		String arquivoCSS = getClass().getResource("/fxml/Login.css").toExternalForm();
		
		
		// Chama o arquivo FXML
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		// cria um GridPane a partir do FXML
		GridPane raiz = FXMLLoader.load(arquivoFXML);
		
		// sCriando Scene
		Scene cena = new Scene(raiz, 350, 350);
		cena.getStylesheets().add(arquivoCSS); //Importa o css para a cena atual
		
		
		
		primaryStage.setResizable(false); // não permite alterar o tamanho da tela
		primaryStage.setTitle("Tela de login");
		primaryStage.setScene(cena);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
