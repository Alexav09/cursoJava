package classe;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedro.silva@ezmail.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedro.silva@ezmail.com.br";

		// todas geram valor false por comparar local de memoria
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2)); // após a implementação do metodo public boolean equals (Object objeto) no
											// arquivo usuario, essas duas operaçoes a seguir tornam-se True
		System.out.println(u2.equals(u1));

		// com a inclusão do código instanceof no arquivo usuario, elimina a
		// possibilidade de comparaçoes indevidas em tentativas de
		// conversoes, retornando false para qualquer tentativa
		System.out.println(u2.equals(new Date()));
	}
	
	//o Hashcode será abordado em outro exemplo, que faz mais sentido usar em coleções
}
