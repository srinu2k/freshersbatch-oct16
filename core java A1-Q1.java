package helloworld;

public class java_A1_Q1 {

    public static void main(String[] args) {
    	
        int n = 371, num, remainder, result = 0;

        num = n;

        while (num != 0)
        {
            remainder = num % 10;
            result = result+(remainder*remainder*remainder);
            num = num/10;
        }

        if(result == n)
            System.out.println(n + " is an Armstrong number.");
        else
            System.out.println(n + " is not an Armstrong number.");
    }
}