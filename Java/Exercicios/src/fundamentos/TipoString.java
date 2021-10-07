package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		// - String:  conjunto de caracteres que tem funções especiais na linguagem
		System.out.println("Olá pessoal".charAt(0));
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		//ou
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toLowerCase().endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde")); //ignora maiúsculas e minúsculas
		
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 1212.12;
		
		//usar o printf para colocar vários valores
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, 
				sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f", nome, 
				sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
	}

}
