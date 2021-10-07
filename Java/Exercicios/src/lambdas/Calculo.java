package lambdas;

//força a existência de um único método, exceto se criar um método default ou static
//é importante por isso que tenha sempre apenas um método abstract
@FunctionalInterface 
public interface Calculo {
	
	double executar (double a, double b); 
	
	default String legal() {
		return "legal";
		
	}
	
	static String muitoLegal() {
		return "muito legal";
	}
	
	
}
