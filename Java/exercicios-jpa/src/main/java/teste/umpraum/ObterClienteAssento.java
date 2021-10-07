package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
	
	public static void main(String[] args) {
		
		DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
		Cliente cliente = daoCliente.obterPorId(1L);
		System.out.println(cliente.getAssento().getNome() + " " + cliente.getNome());
		daoCliente.fechar();

		
		
		DAO<Assento> daoAssento = new DAO<>(Assento.class);
		Assento assento = daoAssento.obterPorId(3L);
		System.out.println(assento.getNome() + " " + assento.getCliente().getNome());
		daoAssento.fechar();
		
		
		
		//System.out.println(cliente.getAssento().getCliente().getNome());
		
		
		
	}
}
