package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		//Sem o break, o switch executa todos cases abaixo:
		//Faz sentido nesse caso das faixas, porque o faixa preta, por exemplo,
		//Tem que saber todos os katas (bassai-dai, tekki shodan, etc)
		//O faixa marrom, sabe todos da sua faixa em diante...
		//E por aí vai
		String faixa = "amarela";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja": 
			System.out.println("Sei o Heian Sandan");
		case "vermelha": 
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
//existe o default também como abaixo:
//	default:
//			System.out.println("Não sei nada");
		}
	}

}
