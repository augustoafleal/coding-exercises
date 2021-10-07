package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	//MATCH SÃO TAMBÉM FUNÇÕES TERMINADORAS

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		
		//-------------
		
		//ALL MATCH:		
		//VERIFICA SE TODOS DERAM MATCH EM RELAÇÃOA AO PREDICATE APONTADO
		//O RESULTADO É TRUE OU FALSE
		
		System.out.println(alunos.stream().allMatch(aprovado));
		
		//-------------
		
		//ANY MATCH 
		//VERIFICA SE HÁ ALGUM MATCH EM RELAÇÃO AO PREDICADO
		//"PELO MENOS UM" ESTÁ DE ACORDO COM O PREDICATE
		
		System.out.println(alunos.stream().anyMatch(aprovado));
		
		//-------------
		
		//NONE MATCH
		//VERIFICA SE NENHUM DEU MATCH COM O PREDICATE
		//Abaixo se nenhum fosse aprovado, daria true o resultado
		
		System.out.println(alunos.stream().noneMatch(aprovado));
		
		//-------------
		
		//O NEGATE nega alguma informação:
		//abaixo se nenhum fosse reprovado daria true
		Predicate<Aluno> reprovado = aprovado.negate();

		System.out.println(alunos.stream().noneMatch(reprovado));
	}

}
