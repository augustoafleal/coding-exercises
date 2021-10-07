package padroes.observer;

import java.util.Date;

public class EventoChegadaAniversariante {
	//Não necessariamente seria preciso criar a classe que representa o evento, 
	//mas a maioria das implementações dos padrões possuem events pré-criados
	
	//Eu preciso ter uma classe que representa um evento quando existem informações
	//a serem associados
	
	private final Date momento;

	public EventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}
	
	public Date getMomento() {
		return momento;
	}
	
	
	
}
