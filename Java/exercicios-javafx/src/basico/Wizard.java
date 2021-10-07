package basico;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Wizard extends Application {
	
	private Stage janela;
	private Scene passo1;
	private Scene passo2;
	private Scene passo3;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// Setar variável "Stage janela" como a primaryStage
		janela = primaryStage;
		
		// Criação dos métodos
		criarPasso1();
		criarPasso2();
		criarPasso3();
		
		
		janela.setScene(passo1);
		janela.setTitle("Wizard");
		janela.show();
		
	}
	
	private void criarPasso1() {
		
		// Criação de botão
		Button proximoPasso = new Button("Passo 2 >>");		
		
		// Mudar a Scene
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard - Passo 2");
			
		});
		
		// Janela
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(proximoPasso);
		
		// Incialização da cena
		passo1 = new Scene(box, 400, 400);
	
	}
	private void criarPasso2() {
		
		// Criação de botão
		Button passoAnterior = new Button("<< Passo 1");
		Button proximoPasso = new Button("Passo 3 >>");		
		
		// Mudar Scene
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo1);
			janela.setTitle("Wizard");
		});
		
		proximoPasso.setOnAction(e -> {
			janela.setScene(passo3);
			janela.setTitle("Wizard - Passo 3");
		});
		// Janela
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(proximoPasso);
		
		// Incialização da cena
		passo2 = new Scene(box, 400, 400);
		
	}
	
	private void criarPasso3() {
		
		// Criação de botão
		Button passoAnterior = new Button("<< Passo 2");
		Button sair = new Button ("Sair");
		
		// Mudar Scene
		passoAnterior.setOnAction(e -> {
			janela.setScene(passo2);
			janela.setTitle("Wizard - Passo 2");
		});
		
		sair.setOnAction(e -> System.exit(0));
		
		// Janela
		HBox box = new HBox();
		box.setAlignment(Pos.CENTER);
		box.getChildren().add(passoAnterior);
		box.getChildren().add(sair);
		
		// Incialização da cena
		passo3 = new Scene(box, 400, 400);
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
		
	}
}
