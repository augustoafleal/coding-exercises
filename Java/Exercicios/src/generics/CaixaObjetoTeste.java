package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		
		//Neste exemplo, por não usar o generics, preciso ficar fazendo
		//Casts a todo momento
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); //tipo double primitivo. Será convertido para Double
		//(um wrapper)
		
		//Abaixo uso um cast de Double para poder colocar o valor anteriormente
		//double em uma variável do tipo Double (), porque a função abrir() da classe 
		//CaixaObjeto retorna um valor Object, fazendo com que o compilador
		//necessita de especificação 
		
		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("Olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
		
	}

}
