package arrays;

public class Foreach {

	public static void main(String[] args) {
	
		double[] notas = {9.9, 8.7, 7.2, 9.4};
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print(notas[i] + " ");
		}
		
				
		System.out.println();//apenas para pular para nova linha
		
			
		
		//para cada repetição o valor de notas vai apontar para um dos elementos do 
		//array sem ser necessário acessar o elemento a partir do índice 
		//como no caso do "for" acima.		
		for(double nota: notas) {
			System.out.print(nota + " ");
			
		}
		

	}

}
