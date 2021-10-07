package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {
	
	//O construtor private abaixo evita que seja instanciado algum objeto
	//de Validar em outra classe
	
	private Validar() {}
	
	public static void aluno(Aluno aluno) 
			throws StringVaziaException, NumeroForaIntervaloException{
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo.");
		}
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}

}
