package fundamentos.exerciciosFinais;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		//variáveis
		System.out.println("Informe o valor 'a':");
		int a = scanner.nextInt();
	
		System.out.println("Informe o valor 'b':");
		int b = scanner.nextInt();
		
		System.out.println("Informe o valor 'c':");
		int c = scanner.nextInt();
		
		//processamento DELTA 	
		int delta = (b * b) - (4 * a * c);
		
		//saídas DELTA
		System.out.printf("Os valores informados são %dx² + %dx + %d = 0\n", a, b, c);
		System.out.println("O Delta é: " + delta);
		
		
		//cálculos X1 e X2
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("O x1 é %.2f e o x2 é %.2f.", x1, x2);
				
		scanner.close();
				
	}

}
