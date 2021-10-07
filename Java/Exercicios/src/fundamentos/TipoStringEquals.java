package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		//STRINGS SE COMPARA PELO EQUALS!!!!!!!!!!!!!!!!!!!!!
		
		System.out.println("2" == "2"); //não seria O MAIS adequado
		
		String s1 = new String("2");
		System.out.println("2" == s1); //não recomendado
		System.out.println("2".equals(s1)); //mais adequado
		
		//OUTRO EXEMPLO
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next();

		System.out.println("2" == s2.trim());//ESSE AQUI É FALSO 
		//o .trim() retira os espaços em branco da string
		//o .next() tira os espaços em branco automaticamente, o .nextline() não tira
		System.out.println("2".equals(s2));
		
		//USAR O EQUALSIGNORECASE PARA IGNORAR MAIÚSCULAS E MINÚSCULAS
		//EXEMPLO System.out.println("DOMINGO".equalsIgnoreCase(variável));
		entrada.close();
		
	}

}
