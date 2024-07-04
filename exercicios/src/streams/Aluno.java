package streams;

import java.util.Objects;
import java.util.function.Function;
import java.util.function.Predicate;

public class Aluno {
	
	final String nome;
	final double nota;
	
	public Aluno(String nome, double nota) {
		
		this.nome = nome;
		this.nota = nota;
	}
	
	public final static Function<Aluno, String> saudacaoAluno = a -> "Parabens! " +a.nome + "! Você foi aprovado(a)!";
	public final static Predicate<Aluno> aprovado = a -> a.nota >= 7;



	public String toString() {
		return nome + " tem nota " + nota;
	}



	@Override
	public int hashCode() {
		return Objects.hash(nome, nota);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	
	
}
