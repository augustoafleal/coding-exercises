package teste.herancadesafio;

import infra.DAO;
import modelo.herancadesafio.Animal;
import modelo.herancadesafio.Mamiferos;

public class AnimalMamifero {

	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Animal animal = new Animal("Animal", "Especie");
		
		Mamiferos mam = new Mamiferos();
		mam.setNome("Baleia");
		mam.setEspecie("B. Physalus");
		
		dao.abrirT()
		.incluir(animal)
		.incluir(mam)
		.fecharT()
		.fechar();
		
	}

}
