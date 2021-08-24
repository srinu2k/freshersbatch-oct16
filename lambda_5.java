package lambda_functions;

import java.util.ArrayList;

public class lambda_5 {

	public static void main(String[] args) {
		
		 StringBuilder result = new StringBuilder();
		 
		 ArrayList<String> words = new ArrayList<String>();

		 words.add("hi");
		 words.add("new");
		 words.add("different");
		 words.add("yens");
 
		 words.forEach(word -> result.append(word.charAt(0)));

		    System.out.println(result);
	}

}
