package classe;

//import java.util.Date;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.usuario = "pedro.silva@ezemail.com.br";
		
		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.usuario = "pedro.silva@ezemail.com.br";
		
		/* Nas comparações abaixo, ambos serão falsos, porque está comparando 
		 * endereços da memória e não os atributos.
		 *
		 */
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
	//	System.out.println(u2.equals(new Date()));
		
		
	}
	//hashcode é implementado em outro exercício
	
	
}
