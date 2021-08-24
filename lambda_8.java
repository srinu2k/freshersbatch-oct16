package lambda_functions;
import java.util.*;

public class lambda_8 {

	public static void main(String[] args) {
		
		  new Thread(
			      () -> Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
			        .forEach(System.out::print))
			      .start();
	}

}
