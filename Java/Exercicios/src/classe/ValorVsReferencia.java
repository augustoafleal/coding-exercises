package classe;

public class ValorVsReferencia {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; //atribuição por referência
		
		d1.dia = 31;
		d2.mês = 12;
		
		
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		voltarDataParaValorPadrão(d1); //alteração de valor do objeto
		//a partir do método criado
		

		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		
		
	}
	
	static void voltarDataParaValorPadrão(Data d) { //quando se inclui como parâmetro
		//em um método que é uma referência, o efeito é criar uma alteração geral, 
		//ou seja, tem efeito para fora
		d.dia = 1;
		d.mês = 1;
		d.ano = 1970;
	}
	
	static void alterarPrimitivo(int c) { //nesse caso não se passa resultado pra fora
		//porque é criada uma cópia
		c++;
	}
	

}
