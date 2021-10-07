package oo.heranca.teste;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		
		Heroi heroi = new Heroi(10, 11);
		
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Herói tem => " + heroi.vida);
		System.out.println(monstro.atacar(heroi)); //atacar enquanto imprime o valor boolean
		System.out.println(heroi.atacar(monstro)); 
		
		System.out.println(monstro.atacar(heroi)); 
		System.out.println(heroi.atacar(monstro)); 
		
		monstro.andar(Direcao.NORTE);
		System.out.println(monstro.atacar(heroi)); 
		System.out.println(heroi.atacar(monstro)); 
		
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Herói tem => " + heroi.vida);
		
		
		
	}

}
