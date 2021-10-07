package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {
		
		
		//INSTANCIANDO CIVIC
		Carro civic = new Civic();
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println(civic);
		
		
		//INSTANCIANDO FERRARI	
		Ferrari ferrari = new Ferrari();
		ferrari.ligarTurbo();
		ferrari.ligarAr();
		ferrari.desligarAr();
		

		System.out.println(ferrari.velocidadeDoAr());
		
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
		
		ferrari.acelerar();
		ferrari.frear();
		System.out.println(ferrari);
				
		ferrari.acelerar();
		System.out.println(ferrari);

		
	}

}
