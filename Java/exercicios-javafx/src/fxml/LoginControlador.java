package fxml;

import org.controlsfx.control.Notifications;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginControlador {
	
	//as anotações mapeam os elementos para o Login.fxml
	@FXML
	private TextField campoEmail;
	@FXML
	private PasswordField campoSenha;
	
	
	
	// O "#" no arquivo fxml chama este método, que está lá
	// no arquivo escrito como entrar
	public void entrar() { 
		boolean emailValido = campoEmail.getText().equals("aluno@aluno.com.br");
		boolean senhaValida = campoSenha.getText().equals("1234");
		
		if (emailValido && senhaValida) {
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Login efetuado com sucesso.")
			.showInformation();
		} else { 
			Notifications.create()
			.position(Pos.TOP_RIGHT)
			.title("Login FXML")
			.text("Ocorreu uma falha no login.")
			.showError();
		}
	}

}
