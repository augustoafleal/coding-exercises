package fundamentos;

public class ConversaoTiposPrimitivosNumericos {

	public static void main(String[] args) {
		
		double a = 1; //aqui houve uma convesão implícita (de 
		//tipo inteiro para ponto flutuante) 
		System.out.println(a);
		
		float b = (float) 1.1234555555555; //conversao explícita CAST de double para float
		System.out.println(b);

		
		int c = 13;
		byte d = (byte) c; //conversão explícita
		System.out.println(d);
		
		double e = 1.2121212;
		int f = (int) e;
		System.out.println(f);
		
	}

}
