package padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	
	//List de objetos que implementam a INTERFACE ObservadorChegadaAniversariantes
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();
	
	
	//o método abaixo recebe como parâmetro alguém que implementa a interface
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}

	//o método abaixo normalmente ocorre dentro das bibliotecas dos frameworks
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while(!"sair".equalsIgnoreCase(valor)) {
			
		System.out.println("Aniversariante chegou? ");
		valor= entrada.nextLine();
		
			if("sim".equalsIgnoreCase(valor)) {
			
			//criar evento
			EventoChegadaAniversariante evento = 
					new EventoChegadaAniversariante(new Date());
			
			//notificar observadores:
			//Cada observador ao receber o metodo "chegou" irá receber o evento definido
			//que é a DATA
			observadores.stream()
				.forEach(o -> o.chegou(evento));
			
			valor = "sair"; //faz com que termine o programa após o "sim"
			
			} else if (!"sair".equalsIgnoreCase(valor)) { 
			System.out.println("Alarme falso!");
			
			} else { 
				System.out.println("Você saiu!");
		}
	
	}
		
		entrada.close();
	}
	
	
}
