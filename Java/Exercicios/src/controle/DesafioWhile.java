package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double notageral = 0;
		double notasinseridas = 0;
		
		System.out.println("Informe a nota do aluno: ");
		double nota = entrada.nextDouble();
		
		while (nota != -1) {
		
			while(nota < -1 || nota > 10) {
				System.out.println("Nota incorreta");
				System.out.println("Informe a nota do aluno: ");
				nota = entrada.nextDouble();
			}
			
			if(nota != -1) {
				notageral += nota;
				notasinseridas++;
				System.out.println("Informe a nota do aluno: ");
				nota = entrada.nextDouble();
			}
		
		}
					
		System.out.println("O total de notas inseridas foi: " + notasinseridas);
		System.out.println("A soma de todas as notas é: " + notageral);
		System.out.println("A média da turma é: " + (notageral / notasinseridas));

		entrada.close();
		
	}
		
}
	
	

