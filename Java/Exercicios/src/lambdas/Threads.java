package lambdas;

public class Threads {

	public static void main(String[] args) {
		
		//MESMO ITNERFACES NÃO CRIADAS PARA SEREM FUNCIONAIS, ISTO É, INTERFACES
		//CRIADAS ANTES DO JAVA 8, PODEM SER ATUALMETNE UTILIZADAS COM FUNÇÕES LAMBDA
		//COMO É O CASO DO "TRABALHO3" ABAIXO 
		
		
		Runnable trabalho1 = new Trabalho1(); //aqui foi criada uma classe que implementa
		//a interface RUNNABLE (dá mais trabalho)
		Runnable trabalho2 = new Runnable() { //aqui eu crio uma classe anônima para ter
			//o trabalho2
					
			public void run() {
				 for (int i = 0; i < 10; i++)	 {
					 System.out.println("Tarefa #02");
					 try {
						 Thread.sleep(100);
					 } catch (Exception e) { 
					 }
				 }
			}
		};
		
		//IMPLEMENTANDO EM LAMBDA 
		Runnable trabalho3 = () -> { 
			for (int i = 0; i < 10; i++)	 {
				 System.out.println("Tarefa #03");
				 try {
					 Thread.sleep(100);
				 } catch (Exception e) { 
				 }
		}
		};
				
		//THREAD É UM PROCESSO EXECUTADO PARALELAMENTE
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		t1.start();
		t2.start();
		t3.start();
		
	}
	
}
