package layout;

import javafx.geometry.Pos;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class TesteAnchorPane extends AnchorPane {
	
	public TesteAnchorPane() {
		
		Quadrado q1 = new Quadrado();
		setTopAnchor(q1, 10.0);
		setLeftAnchor(q1, 10.0);
		
		Quadrado q2 = new Quadrado();
		setRightAnchor(q2, 10.0); // o ancoramento recebe o valor em pixels em Double
		setTopAnchor(q2, 10.0);

		Quadrado q3 = new Quadrado();
		setBottomAnchor(q3, 10.0);
		setLeftAnchor(q3, 10.0);
		
		Quadrado q4 = new Quadrado();
		setBottomAnchor(q4, 10.0);
		setRightAnchor(q4, 10.0);
		
		// Criar HBox para conseguir dentro de um AnchorPane centralizar
		// o q5
		// Isso porque o AnchorPane ANCORA os elementos 
		// nas direções acima, abaixo e laterais
		HBox centro = new HBox();
		centro.setAlignment(Pos.CENTER);
		setTopAnchor(centro, 110.0);
		setBottomAnchor(centro, 110.0);
		setLeftAnchor(centro, 110.0);
		setRightAnchor(centro, 110.0);
		
		// Adicionar q5 em "centro"
		Quadrado q5 = new Quadrado();
		centro.getChildren().add(q5);
		
		// Adicionar todos componentes no AnchorPane
		getChildren().addAll(q1, q2, q3, q4, centro);
		
	}

}
