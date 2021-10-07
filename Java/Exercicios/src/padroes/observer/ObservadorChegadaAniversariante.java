package padroes.observer;

@FunctionalInterface //como interface funcional (que tem apenas um único método)
//posso passar uma Lambda no método registrarObservador do Porteiro 
public interface ObservadorChegadaAniversariante {

	//Não precisa ser uma Interface, porém é útil para definir o método a ser 
	//chamado quando o evento aconteceu
	
	//TODO OBSERVADOR DEVERÁ IMPLEMENTAR ESSA INTERFACE
	
	public void chegou(EventoChegadaAniversariante evento);
	
	//o método é abstrado porque nas interfaces os métodos são abstratos por PADRÃO
	
	
}
