package excecao;

public class Causa {

	public static void main(String[] args) {
		
		try {
			metodoA(null);
		} catch (IllegalArgumentException e) {
			if(e.getCause() != null) { 
				System.out.println(e.getCause().getMessage());
				//getCause() serve para ver a exceção que CAUSOU o problema inicial, no caso
				//aquela criada no metodoB
				//Erros podem ter uma sequência de causas
			}
		}
		
		metodoA(null);
		
	}
	
	static void metodoA(Aluno aluno) { 
		try {
			metodoB(aluno);
		} catch (Exception causa) { //relancei a exceção com outro tipo
			//o termo "causa" ao lado de "Exception" é a exceção do metodoB 
			throw new IllegalArgumentException(causa);
		}
	}
	
	static void metodoB(Aluno aluno) { 
		if(aluno == null) { 
			throw new NullPointerException("Aluno está NULO!");
		}
		
		System.out.println(aluno.nome);
		
	}
}
