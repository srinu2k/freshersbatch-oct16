package lambda_functions;
import java.util.*;

public class lambda_7 {

	public static void main(String[] args) {

		 Map<String, Integer> map = new TreeMap<>();
		    map.put("c", 3);
		    map.put("b", 2);
		    map.put("a", 1);

		    StringBuilder result = new StringBuilder();
		    map.entrySet()
		      .forEach(entry ->
		        result.append(entry.getKey())
		          .append(entry.getValue()));

		    System.out.println(result.toString());

		 
	}

}
