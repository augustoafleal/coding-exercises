package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

		public static void main(String[] args) {
			
			Queue<String> fila = new LinkedList<>();
			
			fila.add("Ana"); // .ADD se a FILA possuir um limite de inclusões e esse
			//limite tiver sido alcançado, o .add gera uma mensagem de erro
			
			fila.offer("Bia"); //.OFFER utiliza-se o offer para os casos em que a 
			//FILA possui um limite de inclusões. Ele retorna TRUE (se deu para
			//adicionar) ou FALSE se não deu para adicionar
			
			//ASSIM O ADD DIFERE DO OFFER PORQUE O PRIMEIRO GERA MENSAGEM DE ERRO
			//E O SEGUNDO GERA TRUE OR FALSE
			
			//A DIFERENÇA OCORRE QUANDO A FILA ESTÁ CHEIA
			
			fila.add("Carlos");
			fila.offer("Daniel");
			fila.add("Rafaela");
			fila.offer("Gui");
			
			
			//PEEK e ELEMENT como abaixo retornam algum dado adicionado na fila
			//MOSTRAM O PRÓXIMO ELEMNTO DA FILA (SEM remover)
			//A diferença é que se NÃO há dados na fila, o PEEK gera um null
			//e o ELEMENT gera uma mensagem de erro
			
			//A DIFERENÇA OCORRE QUANDO A FILA ESTÁ VAZIA
			System.out.println(fila.peek());//retorna falso
			System.out.println(fila.peek());
			System.out.println(fila.element());//gera mensagem de erro
			System.out.println(fila.element());
			
			
			
			

			//POLL E REMOVE MOSTRAM O PRÓXIMO ELEMNTO DA FILA E REMOVE
			//DIFERENÇA DE COMPORTAMENTO QUANDO A FILA ESTIVER VAZIA
			
			System.out.println(fila.poll()); //retorna o primeiro elemento da fila 
			//enquanto já o remove (se a fila estiver vazia retorna um valor false)
			
			System.out.println(fila.remove());// dá erro
			
			
			
			
			//OUTROS COMANDOS

			//fila.size();
			//fila.clear();
			//fila.isEmpty(); (saber se a fila está vazia)
			
		}
	
}
