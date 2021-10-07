package controle;

public class For1 {

	public static void main(String[] args) {
		
		
		for(int contador = 0; contador <= 20; contador += 2) {
			System.out.printf("Bom dia - %d.\n", contador);
		
		}
		
		//não obrigatoriamente as 3 partes do FOR precisam estar definidas dentro do for
		//MAS NÃO É RECOMENDADO, COMO NO CASO DO EXEMPLO ABAIXO
		
		int x = 2;
		for (; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		//FOR com laço infinito
	//	for(;;) { 
	//		System.out.println("Fim");
	//	}
	//	
		//Outra forma de FOR com laço infinito 
	//	for(;true;) { 
	//		System.out.println("Fim");
	//	}
	
	}

}
