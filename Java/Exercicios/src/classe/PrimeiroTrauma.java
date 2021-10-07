package classe;

public class PrimeiroTrauma {
	
	int a = 3; 
	static int b = 4;
	
	public static void main(String[] args) {
		
				
		//solução: é preciso instanciar um objeto, pois a variável a pertence
		//a objetos, uma vez que NÃO é uma variável da classe:
		
		PrimeiroTrauma a1 = new PrimeiroTrauma();
		System.out.println(a1.a);
		
		
		//outra possibilidade é transformar a variável em uma
		// variável da classe. Para isso, foi colocado static antes da variável
		// b em static, tornando-o diretamente associado à classe:
				
		System.out.println(b);
		
		

	}

}
