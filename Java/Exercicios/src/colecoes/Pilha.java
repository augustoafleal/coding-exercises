package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Dom Quixote "); //gera mensagem de erro se estiver excedido o limitez
		livros.push("O Hobbit"); 
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		//ABAIXO É PARA VER TODOS OS ELEMENTOS
		for (String livro: livros) {
			System.out.println(livro);
		}
		System.out.println(livros.pop()); //assim como o remove o POP gera erro
		//se não tiver elementos na fila
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		
		//livros.size();
		//livros.clear();
		//livros.contains();
		System.out.println(livros.isEmpty());
		
		
		
	}

}
