package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {
	
	public TesteFlowPane() {
		
		//Segue o fluxo dos movimentos que a janela fizer
		
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();
		
		setHgap(10); //cria espaço entre elementos na horizontal
		setVgap(10); // cria espaço entre elementos na vertical
		setPadding(new Insets(10)); // cria espaço em diversas direções
		setOrientation(Orientation.VERTICAL); // dispõe a orientação inicial dos objetos
		setAlignment(Pos.CENTER_RIGHT); // alinha os elementos em relação a alguma direção
		
		
		
		getChildren().addAll(q1, q2, q3, q4, q5);
		
		
		
		
	}

}
