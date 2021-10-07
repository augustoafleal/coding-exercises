package excecao.personalizadaA;

@SuppressWarnings("serial")
//esse supress evita a serialização
public class NumeroForaIntervaloException extends Exception {
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está fora do intervalo.", 
				nomeDoAtributo);
	}
	

}
