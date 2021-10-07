package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		//TENHO QUE OBSERVAR A ASSINATURA DA FUNÇÃO NA INTERFACE
		//A variável é uma variável da interface "Calculo" que possui apenas um único método
		// e por isso o Java sabe que o Lambda remete à única função dentro da interface
		
		Calculo calc = (x, y) -> { return x + y; };
		System.out.println(calc.executar(2, 3));
		
		//É possível não utilizar chaves após o ->. Nesse caso, aquilo que eu colocar
		// após o sinal será obrigatoriamente retornado 
		//Mas para isso deve ter apenas uma sentença de código
		
		//Se não tiver {} não precisa escrever return que fica implícito
		//Se usar {}, precisa usar return
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
		
	}

}
