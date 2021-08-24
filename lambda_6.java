package lambda_functions;

import java.util.ArrayList;

public class lambda_6 {

	public static void main(String[] args) {
				

		 
		 ArrayList<String> words = new ArrayList<String>();

		 words.add("hi");
		 words.add("new");
		 words.add("different");
		 words.add("yens");
 
		words.replaceAll(String::toUpperCase);

		    System.out.println(words);

	   

	}

}
