package layout;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.TilePane;

public class TesteTilePane extends TilePane {
	
	// Mantém o mesmo tamanho dos componentes, diferente do GridPane que oferece
	// maior flexibilidade
	
	public TesteTilePane() {
		
		List<Quadrado> quadrados = new ArrayList<>();
		
		for (int i = 1; i < 9; i++) {
			quadrados.add(new Quadrado(i * 10));
			
		}
		
		setPadding(new Insets(20, 20, 20, 20));
		setVgap(10);
		setHgap(10);
		
		setOrientation(Orientation.VERTICAL);
		setTileAlignment(Pos.BOTTOM_RIGHT);
		
		getChildren().addAll(quadrados);
		
	}

}
