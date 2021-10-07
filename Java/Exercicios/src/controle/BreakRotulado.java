package controle;

public class BreakRotulado {

	public static void main(String[] args) {
		//EXTERNO E INTERNO SÃO NOMES DADOS AOS LAÇOS PARA ROTULAR ELES DEPOIS
		//NO BREAK
		//NO CASO ABAIXO, SE EU NÃO COLOCAR O RÓTULO NO BREAK, ELE IRÁ PULAR O 1
		//APENAS EM RELAÇÃO AO LAÇO INTERNO
		
		externo: for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1) {
					break externo;
				}
			
			System.out.printf("%d %d ", i, j);
			
			}
			
			System.out.println();
		}
	}

}
