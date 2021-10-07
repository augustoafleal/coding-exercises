package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		
		AreaCirc a1 = new AreaCirc(10);
		System.out.println(a1.area());

		//AreaCirc a2 = new AreaCirc(5);
		
		
		/* No exemplo abaixo, é utilizado o método estático criado.
		 * Ocasião em que não precisou ser criada uma instância nem para 
		 * acessar o método da classe nem para acessar o atributo de classe
		 */
		
		System.out.println(AreaCirc.area(0));
		
		System.out.println(AreaCirc.PI);
	}

}
