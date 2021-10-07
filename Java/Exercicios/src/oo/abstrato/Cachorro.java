package oo.abstrato;

public class Cachorro extends Mamifero {
	
	
//	@Override NÃO POSSO MAIS IMPLEMENTAR POIS AO MÉTODO MOVER FOI ACRESCIDO UMA CONSTANTE
//	NA CLASSE MAMÍFERO
//	public String mover() {
//		return "Usando as patas";
//	}
	
	@Override
	public String mamar() {
		return "Usando leite";
	}

}
