package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		//A variável aloca um espaço na memória
		int raio = 3;
		double raio2 = 3.4; //double indica tipos reais
		final double PI = 3.13159; //a função final torna o valor imutável,
		//isto é, cria uma constante
		//as constantes devem utilizar letra maíscula
		
		double area = PI * raio2 * raio2;
		
		System.out.println(area);
		
		raio = 10;
		area = PI * raio * raio;
		
		System.out.println("Área = " + area);
		
	}
}
