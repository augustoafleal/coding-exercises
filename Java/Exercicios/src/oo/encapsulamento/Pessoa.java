package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	
	
	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
		//this.idade = idade;
	}
	
	//GETTER
	public String getNome() {
		return nome;
	}

	//SETTER
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	//MÉTODO GETTER PARA OBTER SOMENTE UMA PARTE DAS INFORMAÇÕES
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}
	
	//GETTER
	public int getIdade() {
		return idade;
	}
	
	//SETTER	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
		this.idade = novaIdade;
		}
	}
	
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome()
		+ " e tenho " + getIdade() + " anos.";
		
	}
	
}
