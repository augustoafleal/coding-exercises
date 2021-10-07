package layout;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Caixa extends HBox {
	
	private static int i = 0;

	private String[] cores = { 
		"#c33c5e", "#39aac6", "#28d79a",
		"#fb750e", "#6657a8", "f9060e"
	};
	
	public Caixa() {
		this(100, 100);
		
	}
	
	public Caixa(int largura, int altura) {
		setAlignment(Pos.CENTER);
		
		setMinWidth(largura);
		setMinHeight(altura);
		
		// Variação de cores a cada abertura
		BackgroundFill fill = new BackgroundFill(
				Color.web(cores[i++]), CornerRadii.EMPTY,
				Insets.EMPTY);
		
		if(i == 6) i = 0;

		setBackground(new Background(fill));
	}
	
	// Método que adiciona Label na caixa
	// Como o método retorna uma Caixa, posso encadear ele j
	// unto com o construtor de caixa na classe AppLayout.class
	
	public Caixa comTexto(String texto) { 
		Label label = new Label(texto);
		label.setFont(new Font(24));
		getChildren().add(label);
		return this;
		
	}
}
