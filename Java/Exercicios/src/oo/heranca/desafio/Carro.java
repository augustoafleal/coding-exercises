package oo.heranca.desafio;

public class Carro {
	
	public final int VELOCIDADE_MAXIMA;
	int velocidade = 0;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){ 
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	
	public void acelerar() {
		if(velocidade + getDelta() > VELOCIDADE_MAXIMA) { 
			velocidade = VELOCIDADE_MAXIMA;
		} else { 
		velocidade += getDelta();
		}
	}
	
	public boolean frear() {
		if(velocidade >= 5) {
			velocidade -= 5;
			return true;
		}else { 
			velocidade = 0;
		return false;
		}
	}
	
	public String toString () {
		return "A velocidade atual é " + velocidade + " Km/h";
	}


	public int getDelta() {
		return delta;
	}

	
	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
	//criar dois carros específicos
	//velocidade atual (atributo) e método acelerar(5 em 5) e método frear (5 em 5
	//não menos que 0)
	
	//ferrari não acelera como carro normal, então acelera de 15 em 15
	
	

}
