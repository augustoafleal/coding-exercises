package generics;

public class CaixaObjeto {

	//Exempo de classe SEM generics
	
	private Object coisa;
	
	public void guardar(Object coisa) { 
		this.coisa = coisa;
	}
	
	public Object abrir() { 
		return coisa;
	}
}
