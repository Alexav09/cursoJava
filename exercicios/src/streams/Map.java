package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.List;

public class Map {

	public static void main(String[] args) {

		Consumer<String> print = System.out::print;

		List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

		marcas.stream().map(m -> m.toUpperCase()).forEach(print);

		//UnaryOperator<String> maiuscula = n -> n.toUpperCase(); //poderia ser usado dessa forma ou elimir usando a Classe Utilitarios criada
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		//UnaryOperator<String> grito = n -> n + "!!! "; //poderia ser usado dessa forma ou elimir usando a Classe Utilitarios criada

		System.out.println("\n\nUsando composição...");
		marcas.stream()
			//.map(maiuscula) // sem usar a classer utilitarios
			.map(Utilitarios.maiuscula) //usando a classe Utilitarios para reduzir a criação de códigos
			.map(primeiraLetra)
			//.map(grito) //sem usar a classer utilitarios
			.map(Utilitarios::grito)//utilizando a classe Utilitarios
			.forEach(print);

	}
}
