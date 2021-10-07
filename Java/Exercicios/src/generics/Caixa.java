package generics;

//eu coloco um tipo genérico dentro dos símbolos "< >" e com isso
//fica criado um tipo genérico 
//Normalmente se uso a letra "T" para representar o tipo genérico

public class Caixa<T> {
	
	//feito isso, insiro tipo dentro da variável inicialiada e dos métodos abaixo 
	
	private T coisa;
	
	public void guardar(T coisa) { 
		this.coisa = coisa;
	}
	public T abrir (){ 
		return coisa;
	}

}
