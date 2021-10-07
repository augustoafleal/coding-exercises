package oo.abstrato;

public abstract class Animal {

	public String respirar() {
		return "Usando oxigênio";
		
	}
	
	public abstract String mover(); //método definido como abstrato, para evitar ter que 
	//definir o corpo para este método, que depende muito do instancimento dos objetos
	
	//só é possível ter um
	
	
	
	
}
