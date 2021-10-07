package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		
		double media = 5.4;
		String resultadoParcial = media >= 5.0 ? "em recuperação." : "reprovado.";
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno está " + resultadoFinal);
		
		/*
		 * Exemplo de caso que envolve um ternário dentro de outro ternário:
		 * String resultadoFinal = media >= 7.0 ? "aprovado." : 
		 * media >= 5.0 ? "em recuperação." : "reprovado.";
		 * 
		 * NÃO é recomendável, pois deixa o código CONFUSO.
		 */
		
		
		double nota = 7.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota  >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		String resultadoDesconto = temDesconto ? "Sim." : "Não.";
			
		System.out.println("Tem desconto? " + resultadoDesconto);
		
		
	}

}
