package lambdas;

public class CalculoTeste1 {
	
	public static void main(String[] args) {
		
		Calculo calculo = new Somar();
		System.out.println(calculo.executar(2, 3));
		
		
		//NOVA IMPLEMENTAÇÃO DE CALCULO
		calculo = new Multiplicar();
		System.out.println(calculo.executar(2, 3));
		
	
		
		//COMO AS DUAS CLASSES IMPLEMENTAM A MESMA INTERFACE, 
		//EU USO O POLIMORFISMO DO MÉTODO EXECUTAR E ESTE TEM FUNÇÕES DIFERENTES 
		//EM RAZÃO DAS CLASSES SOMAR E MULTIPLICAR
		
	}

}
