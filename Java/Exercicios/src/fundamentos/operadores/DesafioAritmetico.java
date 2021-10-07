package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
		
		
		int a = 6 * (3 + 2);
		int b = (int) Math.pow(a, 2) / (3 * 2);
		
		int c = (1 - 5) * (2 - 7) / 2;
		int d = (int) Math.pow(c, 2);
		
		int e = (b - d) ;
		int f = (int) Math.pow(e, 3);
		
		int resultado = f / (int) Math.pow(10, 3);
		
		System.out.println(resultado);
		
		
		// resultado tem que ser 125
	}

}
