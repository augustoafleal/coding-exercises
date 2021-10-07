package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//informacoes do funcionario
		
		//tipos numéricos inteiros
		
		byte  anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56786;
		long pontosAcumulados = 3_234_845_223L; //separado com underline para facilitar a visualização
		//é colocado o L maiúsculo ao final do número por conta do Long ter passado do limite do inteiro
		
		//tipos números reais
		
		float salario = 11_445.44F;
		//assim como Long, é preciso colocar um f ao final do número por que extrapola o padrão do double;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//tipo booleano
		boolean estaDeFerias = false;  // true
		
		// tipo caractere
		char status = 'A'; // ativo. Sempre deve ter APENAS uma letra dentro do char.
		// pode até ser utilizado \u0010 (quando é utilizado um número dentro da tabela UNICODE)
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//ID
		System.out.println(id + ": ganha -> " + salario);
		
		//Férias
		System.out.println("Férias? "+ estaDeFerias);
		
		//Variável char
		System.out.println("Status: " + status);
		
	}
}
