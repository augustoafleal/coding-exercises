package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("16A");
		Cliente cliente = new Cliente("Idílio", assento);
		
		// DAO criado com Object para poder ser utilizado com os dois objetos 
		// "assento" e "cliente", porque as tarefas realizadas nessa classe 
		// não necessitam que seja criado um dao para cada um dos objetos
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		.incluir(assento) //DEVO INSERIR O ASSENTO ANTES, pois o ID dele irá constar
		// na coluna do cliente. Sendo na mesma transação, poderia incluir cliente
		// antes do assento ou caso houvesse um "cascade" ao lado da anotação 
		// @OneToOne, mas em transações diferentes não é possível
		.incluir(cliente)
		.fecharT() //comittar
		.fechar(); //fechar conexão
	}

}
