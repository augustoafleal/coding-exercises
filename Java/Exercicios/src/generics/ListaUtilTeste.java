package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		//Aqui eu preciso fazer um cast sempre que utilizar o método getUltimo1
		//criado na classe ListaUtil, porque não estou utilizando um tipo genérico
		
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem1);
		
		Integer ultimoNumero1 = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(ultimoNumero1);
		
		
		
		//ABAIXO UTILIZO O MÉTODO getUltimo2, QUE CONTÉM UM TIPO GENÉRICO
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLinguagem2);
		
		//posso também especificar o tipo como na linha abaixo antes de escrever
		//o método getUltimo2, embora NÃO seja necessário
		Integer ultimoNumero2 = ListaUtil.<Integer>getUltimo2(nums);
		System.out.println(ultimoNumero2);
		
		
	}

}
