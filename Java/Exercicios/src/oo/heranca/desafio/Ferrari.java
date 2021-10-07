package oo.heranca.desafio;

//Uma classe pode implementar de múltiplas interfaces
//Ao herdar de uma interface, deve-se obrigatoriamente implementar os métodos que nela constam
public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari(){
		this(315); //não preciso alterar o delta aqui pois o this aponta para o CONSTRUTOR 
		//abaixo 
	}
	
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;

	}
	
	@Override
	public void desligarAr() {
		ligarAr = false;
			
	}
	
	@Override
	public int getDelta() {
	
		if (ligarTurbo && !ligarAr) { 
			return 35;
			
		} else if (ligarTurbo && ligarAr) {
			return 30;
			
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		
		} else {
			return 15;
		

		}
		
	}
	
	
	
	
	
	
//	@Override
//	void acelerar(Carro carro) {
//		super.acelerar(carro); //Não faz sobrescrito nenhum.
//	}
//	

}
