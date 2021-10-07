package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {
	
	private int contador = 0;
	
	public void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		// Limpo todas as possíveis cores aplicadas antes do condicional
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if(contador < 0) {
			label.getStyleClass().add("vermelho");
		} else if (contador > 0){ 
			label.getStyleClass().add("verde");
		}
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");
		
		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");
		atualizarLabelNumero(labelNumero);

		
		// Criação dos botões
		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(e -> { //é o evento recebido como parâmetro
			contador--;
			atualizarLabelNumero(labelNumero);
		});
		
		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction(e -> { 
			contador++;
			atualizarLabelNumero(labelNumero);
		});
		
		// Design dos botões
		HBox boxBotoes = new HBox();
		boxBotoes.setAlignment(Pos.CENTER);
		boxBotoes.setSpacing(10);
		boxBotoes.getChildren().add(botaoDecremento);
		boxBotoes.getChildren().add(botaoIncremento);
		
		// Formato vertical da tela principal
		VBox boxConteudo = new VBox();
		
		// Atribuição da classe do CSS
		boxConteudo.getStyleClass().add("conteudo");
		
		// Definições do boxConteudo
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);
		
		//Importando o caminho do CSS
		String caminhoDoCss = getClass()
				.getResource("/basico/Contador.css").toExternalForm();
		
		// Criando a cena principal
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);

		// Aplicando o CSS à cena principal
		cenaPrincipal.getStylesheets().add(caminhoDoCss);
		cenaPrincipal.getStylesheets().add("https://fonts.googleapis.com/css2?family=Oswald");
		
		
		primaryStage.setScene(cenaPrincipal);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
				
	}
}
