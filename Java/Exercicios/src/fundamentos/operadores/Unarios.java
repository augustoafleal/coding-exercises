package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1		POSTFIX
		a--; // a = a - 1		POSTFIX
		System.out.println(a);
		
		
		++b; // b = b + 1		PREFIX
		--b; // b = b - 1		PREFIX
		System.out.println(b);
		
		//CÓDIGO NÃO RECOMENDÁVEL PORQUE FICA COMPLEXO. IDEAL SEMPRE MANTER O CÓDIGO SIMPLES
		System.out.println(++a == b--); //é verdadeiro porque a incrementação do a vem antes da comparação
		//e a decrementação de b só ocorre após a comparação entre a incrementado e b
		System.out.println(a == b);		
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
