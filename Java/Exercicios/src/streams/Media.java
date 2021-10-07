package streams;

public class Media {
	
	private double total;
	private int quantidade;
	
	public Media adicionar(double valor) { //ao retornar valor do tipo Media, eu consigo encadear
		//no próprio construtor na classe em que instancio "MediaTeste".
		total += valor;
		quantidade++;
		return this;
	}
	
	public double getValor() { 
		return total / quantidade;
	}
	
	//criar um get para mostrar os valoresde total e quantidade
	public String get() {
		return String.format("%.2f e %d", total, quantidade);
		
	}
	
	
	//com o método abaixo eu consigo COMBINAR DUAS MÉDIAS INSTANCIADAS, produzindo um único resultado
	public static Media combinar(Media m1, Media m2) { 
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;
		resultante.quantidade = m1.quantidade + m2.quantidade;
		return resultante;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
