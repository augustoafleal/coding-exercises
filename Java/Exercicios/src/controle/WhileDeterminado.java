package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		//ESSE WHILE SE CHAMA DETERMINADO PORQUE SE DETERMINA O NÚMERO DE REPETIÇÕES
		int contador = 1;
		
		while(contador  <= 10) { 
			System.out.printf("Bom dia - %d.\n", contador);
			contador++;
		}

	}

}
