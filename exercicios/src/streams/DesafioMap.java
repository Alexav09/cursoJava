package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		/*
		 * 1. Numero para String binária ....6 => "110"    Integer.toBinaryString(decimal);
		 * 2. Inverter a String ... "110" => "011"  StringBuilder(frase).reverse().toString()
		 * 3. Converter de volta para inteiro => "011" => 3  Integer.parseInt(binaryNumber,2);
		 */
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString(); //item 2
		
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s,2); //item 3 
		
		nums.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);
	}

}
