package oo.composicao;

public class Carro {

		final Motor motor; // pode ser inicializado o motor aqui / 
		//também pode receber como parâmaetro pro construtor,
		//ou, pode também iniciar no construtor.
		
		Carro(){
			this.motor = new Motor(this); //motor inicializado no construtor. Com isso
		}								//o motor será vinculado ao carro
		
		void acelerar() {
			if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;			
			}
		}
		
		void frear() {
			if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
			} 
		}
		
		void ligar () {
			motor.ligado = true;
		}
		
		void desligar () {
			motor.ligado = false;
		}
	
		boolean estaLigado() {
			return motor.ligado;
		}
}
