package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim.");

	}
	
	//Exceção não checada ou não verificada
	//Não basta criar a instância de uma exceção, é preciso lançar a exceção
	//por meio da palavra reservada "throw"
	//O termo throw só pode ser utilizado para classe que tenha relação/herde de Throwable
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro #01");
	}
	
	//Essa é uma exceção checada e por isso deve ter especificação na assinatura do método
	//A assinatura deixa claro isso
	//Por ser uma exceção checada, eu preciso obrigatoriamente tratar
	//A exceção no ponto que estou chamando o "geraErro2"
	
	//Só não precisaria tratar a exceção caso o método main
	//lançasse uma  exceção "throws Exception". Nesse caso eu teria que lançar a 
	//Exceção para outro método. Porém, como o método main é o primeiro,
	//O programa sairia de forma abrupta.
	
	static void geraErro2() throws Exception {
		throw new Exception ("Ocorreu um erro #02");
	}
}
