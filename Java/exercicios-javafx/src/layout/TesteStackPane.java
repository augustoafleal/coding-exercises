package layout;

import javafx.application.Platform;
import javafx.scene.layout.StackPane;

public class TesteStackPane extends StackPane {
	
	public TesteStackPane() {
		
		// Cria uma pilha com os objetos, de forma que somente aparece
		// um dos elementos adicionados quando outros estão exatamente por trás
		
		Caixa c1 = new Caixa().comTexto("1");
		Caixa c2 = new Caixa().comTexto("2");
		Caixa c3 = new Caixa().comTexto("3");
		Caixa c4 = new Caixa().comTexto("4");
		Caixa c5 = new Caixa().comTexto("5");
		Caixa c6 = new Caixa().comTexto("6");
		
		// No StackPane o primeiroa ser exibido é sempre o último adicionado
		getChildren().addAll(c1, c2, c3, c4, c5, c6);
		
		// Trocar as layers com o clique do mouse
		
		this.setOnMouseClicked(e -> {
			// Se o X da Scena for maior que a metade da tela
			// se ele for maior, o usuário clicou do lado DIREITO da tela
			// se ele for menor, o usuário clicou do lado ESQUERDO
			// O X é a posição horizontal do clique
			if(e.getSceneX() > getScene().getWidth() / 2) { 
				getChildren().get(0).toFront();
			} else { 
				getChildren().get(5).toBack();
			}
		});
		
		// Troca as layers automaticamente a cada 3 segundos
		
		Thread t = new Thread(() -> {
			while(true) {
				try {
					Thread.sleep(3000);
					
					// Para funcionar a thread, preciso utilizar o Platform.runLater
					// Servepara o runLater para outras utilizações que envolvem
					// ciclos para mudança da tela
					Platform.runLater(() -> {
						getChildren().get(0).toFront();
					});
					
				} catch (Exception e) {
						System.out.println(e.getMessage());				
				}
			}
		});
		
		t.setDaemon(true); // se a thread da aplicação principal morrer, interrompe 
		// a thread
		t.start();
	}

}
