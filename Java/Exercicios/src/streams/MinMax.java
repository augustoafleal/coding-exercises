package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		
		//Explicação do return 1, -1 e 0 do Comparator abaixo
		//Compares its two arguments for order. Returns a negative integer, zero, or a positive integer 
		//as the first argument is less than, equal to, or greater than the second.
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> { 
			if(aluno1.nota > aluno2.nota) return 1;
			if(aluno1.nota < aluno2.nota) return - 1;
			return 0;			
		};
		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		
		//-------
		
		//CRIANDO UM COMPARATOR DE PIOR NOTA, TAMBÉM POSSO UTILIZAR MAX E MIN
		//MAS NO CASO TENHO QUE MUDAR AS DEFINIÇÕES COM O COMPARATOR melhorNota 		
			
		Comparator<Aluno> piorNota = (aluno1, aluno2) -> { 
			if(aluno1.nota > aluno2.nota) return -1;
			if(aluno1.nota < aluno2.nota) return 1;
			return 0;			
		};
		//Com o piorNota ele vai buscar pelo .max qual é a PIORNOTA e no .min aquele 
		//que tem a melhor das notas
		System.out.println(alunos.stream().max(piorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());

	}
}
