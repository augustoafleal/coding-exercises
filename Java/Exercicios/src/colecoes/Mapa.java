package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		
		
		Map<Integer, String> usuarios = new HashMap<> ();
		
		usuarios.put(1, "Roberto");
		usuarios.put(2, "Ricardo");
		usuarios.put(3, "Rafaela");
		usuarios.put(4, "Rebeca");
		//se eu fizer um .put e incluir valor diferente em uma chave já existente
		//esse novo valor substitui o valor anterior pelo novo na chave pré-existente
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		
		System.out.println(usuarios.keySet());//traz os valores das chaves,
		//não traz a chave de forma ordenada
		System.out.println(usuarios.values());//traz os valores do map
		System.out.println(usuarios.entrySet());//traz chave e valor ao mesmo tempo
		
		
		System.out.println(usuarios.containsKey(2));//contains mostra se é verdadeiro
		//ou falso 
		System.out.println(usuarios.containsValue("Rebeca"));
		
		
		
		System.out.println(usuarios.get(2));//mostra o valor indicado na chave
		//System.out.println(usuarios.remove(1));remove por chave
		//System.out.println(usuarios.remove(1, "Roberto"));remove por indicação de
		//chave e valor

		
		
		//PERCORRENDO OS VALORES COM FOREACH
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
			
		}
		
		
	}

}
