package lambda_functions;

public class lambda_1 
{
	public static void main(String[] args) 
	{
        Arithmetic addition = (int n1, int n2) -> n1 + n2;
        Arithmetic subtraction = (int n1, int n2) -> n1 - n2; 
        Arithmetic multiplication = (int n1, int n2) -> n1 * n2;
        Arithmetic division = (int n1, int n2) -> n1 / n2;
        Arithmetic modulo = (int n1, int n2) -> n1 % n2;
        System.out.println("Addition of 10 and 5: " + addition.operation(20, 2));
        System.out.println("Subtraction of 10 and 5: " + subtraction.operation(20, 2));
        System.out.println("Multiplication of 10 and 5: " + multiplication.operation(20, 2)); 
        System.out.println("Division of 10 and 5: " + division.operation(20, 2)); 
        System.out.println("Modulo of 10 and 5: " + modulo.operation(20, 2)); 
    } 
}
 
@FunctionalInterface
interface Arithmetic {
 
    int operation(int n1, int n2);
 
}