package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Sobrinho;
import modelo.muitospramuitos.Tio;

public class NovoTioSobrinho {

	public static void main(String[] args) {
		
		Tio tia1 = new Tio("Dalina");
		Tio tio2 = new Tio("Ary");
				
		Sobrinho sobrinho1 = new Sobrinho("Jobson");
		Sobrinho sobrinha2 = new Sobrinho("Calista");
		
		
		// Por coerência em relações bidirecionais, preciso adicionar o sobrinho1 
		// na tia1 e vice-versa, isto é, a tia1 no sobrinho1.
		// O método get é utilizado para poder atuar sobre o Array criado nas classes
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		
		tia1.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tia1);
		
		tio2.getSobrinhos().add(sobrinha2);
		sobrinha2.getTios().add(tio2);
		
		tio2.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio2);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
			.incluir(tia1)
			.incluir(tio2)
			.incluir(sobrinho1)
			.incluir(sobrinha2)
			.fecharT()
			.fechar();
		
		
		
	}

}
