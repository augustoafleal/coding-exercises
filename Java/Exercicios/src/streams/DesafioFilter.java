package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		//Instanciando cursos
		CursoDesafioFilter c1 = new CursoDesafioFilter("Programação", 1099.20, "Tecnologia");
		CursoDesafioFilter c2 = new CursoDesafioFilter("Técnico em enfermagem", 2010.39, "Saúde");
		CursoDesafioFilter c3 = new CursoDesafioFilter("Ciência de dados", 3055.00, "Tecnologia");
		CursoDesafioFilter c4 = new CursoDesafioFilter("Website Developer", 500, "Tecnologia");
		
		//Criando collection com cursos
		List<CursoDesafioFilter> cursos = Arrays.asList(c1, c2, c3, c4);
		
		//Criando funções lambda para filter
		Predicate<CursoDesafioFilter> valor = p -> p.preco >= 1000;
		
		Predicate<CursoDesafioFilter> genero = p -> p.genero.equalsIgnoreCase("Tecnologia");
		
		//Criando função lambda para Map
		Function<CursoDesafioFilter, String> mensagem = p -> "Nome do curso: " + p.nome + 
				". Preço: " + String.format("%.2f", p.preco)
				+ ". Gênero: " + p.genero;
		
		cursos.stream()
		.filter(valor)
		.filter(genero)
		.map(mensagem)
		.forEach(System.out::println);
		
		
		
	}
	
}
