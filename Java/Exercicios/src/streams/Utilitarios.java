package streams;

import java.util.function.UnaryOperator;

public class Utilitarios {
	
	
	private Utilitarios() {
		//torno o contstrutor privado para impedir que seja instanciada uma classe Utilitario
		//que nem é necessário, porque tudo é static
	}
	
	public final static UnaryOperator<String> maiscula = 
			n -> n.toUpperCase();
	
	public final static UnaryOperator<String> primeiraLetra = 
			n -> n.charAt(0) + "";//concateno com uma string vazia para gerar 
	//uma nova string com o caractere gerado
			
			
	//abaixo eu crio um método, que poderá ser usado tanto no map da classe 
	//Map.java como em outra ocasião
	//usarei como method reference no map
	public final static String grito (String n) { 
				return n + "!!!"; 
	}
	
}
