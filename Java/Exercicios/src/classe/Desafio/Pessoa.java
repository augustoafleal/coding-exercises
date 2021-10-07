package classe.Desafio;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	Pessoa(){
	}
	
	Pessoa(String nomePessoa, double pesoPessoa){
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;		
	}
	
	void comer(Comida comida) {
		if (comida != null) {
			pesoPessoa += comida.pesoComida;
		}
	}
	

}
