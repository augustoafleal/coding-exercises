package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		porteiro.registrarObservador(namorada);
		
		
		//registro de observador por meio de função Lambda
		porteiro.registrarObservador(e -> { 
			System.out.println("Surpresa! (Em Lambda)");
			System.out.println("Ocorreu em " + e.getMomento());
		});
		
		porteiro.monitorar();
		
		
	}

}
