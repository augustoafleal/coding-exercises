package controle;

public class DesafioFor {

	public static void main(String[] args) {
		
		String valor = "#";
		
		boolean a = false;
		
		
		for (; a == false;) {
			System.out.println(valor);
			valor += "#";
			a = "######".equals(valor);
		}
		
	
		// SOLUÇÀO DO PROFESSOR ABAIXO
		/*
		 * for(String v = "#"; !v.equals("######"); v += "#"){
		 * 		System.out.println(v);
		 */

	}

}
