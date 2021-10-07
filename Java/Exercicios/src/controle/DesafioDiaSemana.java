package controle;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		//String dia = JOptionPane.showInputDialog("Informe o dia da semana");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o dia da semana: ");
		String dia = entrada.next(); 
		//SE PRECISASSE DE MÚLTIPLAS PALAVRAS, USARIA O
		//NEXTLINE
		
		
		//USAR O EQUALSIGNORECASE PARA IGNORAR MAIÚSCULAS E MINÚSCULAS
		//ou usar o toLowerCase como no exemplo da segunda ABAIXO
		//DESDE QUE segunda ESTEJA ESCRITA TODA EM MÍNUSCULAS ENTRE AS ""
		if("Domingo".equalsIgnoreCase(dia)) {
			System.out.println("Domingo - 1");
		
		} else if("segunda".equals(dia.toLowerCase())) {
			System.out.println("Segunda - 2");
			
		} else if("Terça".equalsIgnoreCase(dia)) {
			System.out.println("Terça - 3");
		
		} else if("Quarta".equalsIgnoreCase(dia)) {
			System.out.println("Quarta - 4");
		
		} else if("Quinta".equalsIgnoreCase(dia)) {
			System.out.println("Quinta - 5");
		
		} else if("Sexta".equalsIgnoreCase(dia)) {
			System.out.println("Sexta - 6");
		
		} else if("Sábado".equalsIgnoreCase(dia)) {
			System.out.println("Sábado - 7");
			
		} else {
			System.out.println("Operação inválida");
		}
		
		entrada.close();
		
	}	
	
}


