package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {
	
	
	
	void testeAcessos() {
		
		Ana mae = new Ana();
		
// 		System.out.println(mae.segredo);
//		System.out.println(mae.facoDentroDeCasa);
		System.out.println(formaDeFalar); //eu tenho que acessar a partir da herança
		//e não a partir da instância. Da seguinte forma estaria errado: "mae.formaDeFalar"
		System.out.println(mae.todosSabem);
		
	}

}
