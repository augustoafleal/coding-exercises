package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		//CONVERSÃO DE NÚMEROS EM STRINGS
		
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); //length funciona aqui 
		//porque antes foi convertido para String
		
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		double num3 = 100000.1212;
		System.out.println(Double.toString(num3));
		
		//conversão para String usando a concatenação. Não seria o melhor
		System.out.println(("" + num1).length());
		System.out.println(("" + num2).length());
	}
}
