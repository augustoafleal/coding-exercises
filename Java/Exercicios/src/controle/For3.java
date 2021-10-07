package controle;

public class For3 {

	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++){ 
				System.out.printf("%d i \n %d j \n", i, j);
			}
		}
		
		
		
	}

}
//PARA USAR A VARIÁVEL DO LAÇO FOR FORA DO LAÇO, DEVE-SE DECLARAR ELA ANTES
		//TAMBÉM É POSSÍVEL DECLARAR A VARIÁVEL DENTRO DO LAÇO FOR E FORA
		/*
		 * 	int i = 0;
			for(; i < 10; i++) {
				System.out.println(i);
		}
			System.out.println("Saiu do for.");
			System.out.println(i);
		 */
	