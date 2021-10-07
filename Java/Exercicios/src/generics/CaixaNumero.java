package generics;

// O tipo N deve obrigatoriamente conter um extend do tipo N, de acordo com as 
// informações que constam abaixo

//Consequentemente, classes derivadas de situação assim ficarão restritas a tipos
//numéricos, por conta de ter sido herdada a classe number

public class CaixaNumero<N extends Number> extends Caixa<N> {
	
 

}
