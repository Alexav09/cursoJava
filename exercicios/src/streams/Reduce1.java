package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
			
		Integer total1 = nums.stream().reduce(soma).get();
		System.out.println(total1);
		
		
		Integer total2 = nums.parallelStream().reduce(100, soma);// veja que nesse caso ele somou 100 a cada parcela, pois ele fez as contas em paralelo
		System.out.println(total2);

		Integer total4 = nums.stream().reduce(100, soma); //nesse caso ele somente somou 100 uma única vez e somou os demais valores na sequencia
		System.out.println(total4);
		
		Integer total3 = nums.parallelStream().reduce(0, soma);
		System.out.println(total3);
		
	}

}
