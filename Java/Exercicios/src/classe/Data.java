package classe;

public class Data {

	int dia;
	int mês;
	int ano;
	
	Data() {
		dia = 1;
		mês = 1;
		ano = 1970;
		
	}
	
	Data(int dia, int mes, int ano){
		
		this.dia = dia;
		this.mês = mes;
		this.ano = ano;
		
	}
	
		
/*
 * diaInicial = 01;
		mesInicial = 01;
		anoInicial = 1970;
 */
	
	
	String obterDataFormatada() {
		
		return String.format("%d / %d / %d", this.dia, mês, ano);
		
		
	}
	

	/*
	 * Uma outra possibilidade, embora não seja a mais recomendada, seria a seguinte:
	 * 
	 * void obterDataFormatada(){
	 * 		System.out.printf("%d / %d / %d", dia, mês, ano);	
	 * 
	 * }
	 * 
	 * 
	 * 
	 */
	
	
}

