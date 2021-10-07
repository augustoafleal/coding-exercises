package generics;

//Posso declarar ao lado da classe de nome CaixaInt uma outro tipo genérico <X>
//E repetir esse tipo genérico ao lado da classe herdada (após o extends aqui abaixo).
//Com isso, quem instanciar a classe  CaixaInt<x> deverá passar o tipo

public class CaixaInt extends Caixa<Integer> {
	// Como está acima, porém, o <Integer> ao lado de Caixa resolve o tipo, definindo-o 
	//como Integer
	
	
	
	

}
