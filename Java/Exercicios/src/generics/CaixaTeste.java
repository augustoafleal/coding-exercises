package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		//É interessante especificar o tipo abaixo dentro dos símbolos"<>", 
		//embora não seja necessário
		//Com isso, TODAS as variáveis e métodos da classe Caixa que contenham
		//o tipo genérico genérico passam a ser String para o objeto instanciado abaixo
		//de nome caixaA
		
		//Outra forma de amarrar o tipo há alguma variável declarada que foi criada
		//em classe genérica é por meio de uma herança
		
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Olá!");
		
		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.1415);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
		
		
		
	}

}
