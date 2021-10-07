package colecoes;

import java.util.ArrayList;



public class Lista {

	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		
		//Duas formas de adicionar. Uma usando o meio mais demorado, outra
		//utilizando o construtor
		
		Usuario u1 = new Usuario("Ana"); //meio mais demorado
		lista.add(u1);

		Usuario u2 = new Usuario("Peo"); 
		lista.add(u2);
		
		lista.add(new Usuario("Carlos"));//usando construtor criado na classe Usuario
		//Neste caso estou colocando direto dentro da lista.
		
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		
		//ACESSAR PELO ÍNDICE
		System.out.println(lista.get(3)); 
		
		//REMOVER
		System.out.println(">>>" + lista.remove(1)); //remover pelo índice
		//Quando removo pelo índice, como acima, ele retorna o nome do USUÁRIO
		
		System.out.println(lista.remove(new Usuario("Manu")));
		
		//VERIFICAR SE CONTÉM DETERMINADO DADO
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		//utilização do equals criado na classe Usuario
		System.out.println("Ana".equals(u1.nome));
		System.out.println(u2.nome.equals("Peo"));
		
		
	}
	
}
