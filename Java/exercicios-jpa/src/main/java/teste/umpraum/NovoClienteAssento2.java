package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento2 {

	public static void main(String[] args) {

		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Loja", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
		// Como tem o cascade ao lado da anotação @OneToOne o sistema faz a inserção
		// do assento antes do cliente, para funcionar corretamente o flush
		
		// Antes, no exercício do NovoClienteAssento.java não tinha o cascade inserido
		// e por isso a inserção fora de ordem dava problema
		
		
		
	}

}
