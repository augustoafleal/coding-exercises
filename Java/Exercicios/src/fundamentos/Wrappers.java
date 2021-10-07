package fundamentos;

// import java.util.Scanner;

public class Wrappers {

	public static void main(String[] args) {

		// byte
		Byte b = 100;

		Short s = 1000;

		//Integer i = Integer.parseInt(entrada.next()); // aqui está 
		//sendo convertida uma string para int
		
		Integer i = 10000; // int
		
	//	Long l = 1000000L;

		System.out.println(b.byteValue()); //valor do byte primitivo dentro da classe Byte
		System.out.println(s.toString()); //conversão para string
		System.out.println(i * 3);
		System.out.println(i / 3);

		//Float		
		Float f = 123.3F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		
		//boolean
		Boolean bo = Boolean.parseBoolean("true"); //string para booleano
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());//boolean convertido para string
		
		Character c = '#'; //char
		System.out.println(c + "...");

	}
}
