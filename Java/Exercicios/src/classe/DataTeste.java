package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 15;
		d1.mês = 02;
		d1.ano = 1992;
		
		Data d2 = new Data();

		Data d3 = new Data(8, 12, 1992);
		
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
		
	}
	
}
