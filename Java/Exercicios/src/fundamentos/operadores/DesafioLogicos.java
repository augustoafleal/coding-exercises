package fundamentos.operadores;

public class DesafioLogicos {
		
	public static void main(String[] args) {
			
		//trabalho terça (V ou F)
		//trabalho quinta (V ou F)
		// 1 trabalho tv 32
		// 2 trabalhos tv 50
		// tanto um como outro toma sorvete
		// unico cenário que não nada é nenhum trabalho dar certo
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		
		boolean tv32 = trabalho1 ^ trabalho2; //XOR porque se os dois derem certo comprará a de 50"
		boolean tv50 = trabalho1 && trabalho2;
		
	
		boolean sorvete = trabalho1 || trabalho2;
		
		
		//operador unário
		boolean saudavel = !sorvete;
		
		
		//SAÍDAS		
		System.out.println("Comprou tv32?\"? " + tv32);
		System.out.println("Comprou tv50\"? " + tv50);
		System.out.println("Comprou o sorvete? " + sorvete);	
		System.out.println("Ficou saudável: " + saudavel);
		
		
	}
}
