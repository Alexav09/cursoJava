package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Bia", 6.1);
		Aluno a3 = new Aluno("Daniel", 8.1);
		Aluno a4 = new Aluno("Gui", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Bia", 6.1);
		Aluno a7 = new Aluno("Daniel", 8.1);
		Aluno a8 = new Aluno("Gui", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println); 
		
		/*o uso direto não funciona, mostrará todos os itens pois ele verifica 
		 * o espaço de memória, desta forma todos são diferentes, logo precisamos 
		 * incluir na classe Aluno o seguinte código: equals e hashCode, basta 
		 * clicar com o botão da direita que aparece o  menu para código automático, 
		 * indo em source, Generate hashCode() and equals()
		 * irá incluir o seguinte código:
		 * 
		 * @Override
		 * public boolean equals(Object obj) {
		 * 		if (this == obj)
		 * 			return true;
		 * 		if (obj == null)
		 * 			return false;
		 * 		if (getClass() != obj.getClass())
		 * 			return false;
		 * 		Aluno other = (Aluno) obj;
		 * 		return Objects.equals(nome, other.nome) && Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
		 * 	}
		 */
		
		
		System.out.println("\nSkip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile");
		
		alunos.stream()
			.distinct()
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
		/*
		 * Nesse caso ele somente retornou a Ana pois a Bia está reprovada, 
		 * desta forma ele para, se o próximo aluno estivesse aprovado ele traria 
		 * também, veja o exemplo a seguir
		 */
		
		System.out.println("\nPulando 2 alunos");
		alunos.stream()
		.distinct()
		.skip(2)
		.takeWhile(a -> a.nota >= 7)
		.forEach(System.out::println);
		
		
		
	}
 
}
