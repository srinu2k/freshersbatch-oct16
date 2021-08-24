package lambda_functions;

import java.util.ArrayList;

public class lambda_4 {

	public static void main(String[] args) {
		
ArrayList<String> words = new ArrayList<String>();

words.add("hi");
words.add("new");
words.add("different");
words.add("lens");

words.removeIf(n -> (n.length()%2==1));

for (String str : words) {
    System.out.println(str);
	}

}
}