package oo.polimorfismo;

public abstract class Comida { //o abstract limita a possibilidade de instanaciar novas comidas
	//na classe Comida
	
	private double peso;
	
	public Comida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0){
		this.peso = peso;
		}
	} 
	

}
