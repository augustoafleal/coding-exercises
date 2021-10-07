package classe;

public class AreaCirc {
	
	double raio;
	//a ordem de "static final" pode ser também "final static", pois antes do
	//tipo double, pode-se alterar a ordem das funções
	//o tipo, por outro lado, deve ficar sempre ao lado do nome da variável
	static final double PI = 3.14; //nesta linha o valor de pi ficou diretamente 
	//associado à classe
	
	//construtor
	AreaCirc (double raioInicial) {
		raio = raioInicial;
	}
	
	//método1
	double area() {
		return PI * Math.pow(raio, 2);
	}
	//método2 (estático)
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
