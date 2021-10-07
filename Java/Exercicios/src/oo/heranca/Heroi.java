package oo.heranca;

public class Heroi extends Jogador{
	
	//O extends faz com que se herde da classe Jogador
	 
	//sobrescrever um código herdado:
	
	public Heroi(int x, int y){
		super(x, y);
	}
	
	@Override
	public boolean atacar(Jogador oponente) {
		
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;
		} else {
			return false;
		}
		
	}
	
//	boolean atacar (Jogador oponente) {
//		boolean ataque1 = super.atacar(oponente); //super significa que utilizará o método 
													//definido na SUPERCLASSE
//		boolean ataque2 = super.atacar(oponente);
//		return ataque1 || ataque2;
//		
//	}

}
