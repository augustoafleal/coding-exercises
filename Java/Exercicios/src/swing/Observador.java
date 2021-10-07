package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
	
	public static void main(String[] args) {
		
		//JFrame é o equivalente à janela (tela da aplicação.
		//O JFrame pode receber vários tipos, no caso abaixo foi escolhido do tipo 
		//String com o nome da janela sendo "Observador"
		JFrame janela = new JFrame("Observador");
		
		//Especifica que ao fechar a janela a aplicação também fecha
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		//especifica o tamanho da janela (600 x 200)
		janela.setSize(600, 200);
				
		//Cria um layout para a janela, deixando o botão (criado abaixo) 
		//menor e mais bonito
		janela.setLayout(new FlowLayout());
		
		//Centraliza a tela (o parâmaetro null faz com que fique centralizado na tela
		//do computador)
		janela.setLocationRelativeTo(null);
		
		//cria um botão
		JButton botao = new JButton("Clicar!");
		janela.add(botao);
		
		
		//Implementação do padrão observer no Swing 
		//Observador é o Listener
		//o método ActionListener é uma interface funcional que aceita Lambdas
		//no caso abaixo foi instanciado um newActionListener e como não
		//posso instanciar uma interface o Java automaticamente cria uma classe 
		//anônima para eu especificar o que deve ser executado
//		botao.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				//imprime no console que o comando aconteceu
//				System.out.println("Evento ocorreu!");
//				
//			}
//		});
		
		
		//abaixo exemplo com Lambda
		botao.addActionListener(e -> System.out.println("Evento ocorreu!"));
		
	
		//torna a janela visível
		janela.setVisible(true);	
				
				
	}

}
