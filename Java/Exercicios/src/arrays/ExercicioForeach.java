package arrays;

public class ExercicioForeach {
	
	public static void main(String[] args) {
		
		//notas de alunoA
		double[] notasAlunoA = { 7.9, 8, 6.7, 9.7 };
		
		for(double notas1: notasAlunoA) {
			System.out.print(notas1 + " ");
		}
		
		System.out.println();//apenas para pular para nova linha
		
		//notas do alunoB
		double[] notasAlunoB = {6.9, 8.9, 5.9, 10};
		for(double notas2: notasAlunoB) {
			System.out.print(notas2 + " ");
		}
		
		
	}

}
