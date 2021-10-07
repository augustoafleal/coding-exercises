package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1  ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		System.out.println(!!condicao2);
		
		//é possível misturar operadores lógicos:
		System.out.println(condicao1 && !condicao2);
		
		//tabela verdade &&
		System.out.println("Tabela verdade &&");
		System.out.println(true && true);
		System.out.println(true && false);
	//	System.out.println(false && true);
	//	System.out.println(false && false);
		
		//tabela verdade OR
		System.out.println("Tabela verdade ||");
	//	System.out.println(true || true);
	//	System.out.println(true || false);
		System.out.println(false|| true);
		System.out.println(false|| false);
		
		//tabela verdade XOR:
		System.out.println("Tabela verdade ˆ");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		//tabela verdade NOT:
		System.out.println("Tabela verdade !");
		System.out.println(!false);
		System.out.println(!true);
		
		//tabela verdade NOT:
		System.out.println("Tabela verdade !!");
		System.out.println(!!false);
		System.out.println(!!true);
				
		
	}
}
