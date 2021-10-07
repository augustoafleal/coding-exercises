package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		
	//O fornecedor basicamente devolve algo sem receber parâmetro algum
		

		Supplier<List<String>> umaLista = 
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui");
		//Como quero uma List, tenho que colocar um generics dentro de outro
		//os parênteses vazios antes da "->" fazem parte da sintaxe 
				
		 
		System.out.println(umaLista.get());
				
				
	}

}
