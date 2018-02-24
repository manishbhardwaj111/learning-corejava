package learning.collection;

import java.util.Arrays;
import java.util.List;

public class StreamCollectExp {

	public static void main(String[] args) {
		//Stream.collect() using Supplier, Accumulator and Combiner
		//collect(Supplier supplier, BiConsumer accumulator, BiConsumer combiner)
		List<String> list = Arrays.asList("Mukesh", "Vishal", "Amar");
		String result = list.parallelStream().collect(StringBuilder::new,
	    		(response, element) -> response.append(" ").append(element),
	    		(response1, response2) -> response1.append(",").append(response2.toString()))
	    		.toString();
	    System.out.println("Result: " + result);
	    result = list.stream().collect(StringBuilder::new,
	    		(response, element) -> response.append(" ").append(element),
	    		(response1, response2) -> response1.append(",").append(response2.toString()))
	    		.toString();
	    System.out.println("Result: " + result);

	}

}
