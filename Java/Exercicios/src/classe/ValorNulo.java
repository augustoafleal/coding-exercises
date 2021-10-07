package classe;

public class ValorNulo {

	int a;
	
	public static void main(String[] args) {
		
			
				
		String s1 = "";
		
		System.out.println(s1.concat("!!!"));
		
		//O random como criado abaixo sorteia um valor que pode ser de 0 a 1.		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		//se uma variável pode ser nula, o if é uma formad e evitar que ela seja 
		//acessada e dê um erro (o erro nesse caso é chamado de ERRO DE RUNTIME)
		//É um erro não detectável na compilação, porque só ocorre quando
		//o software estiver rodando.
		if(d1 != null) {
			d1.mês = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;
		
		if(s2 != null) {	
			System.out.println(s2.concat("???"));			
		}

	}

}
