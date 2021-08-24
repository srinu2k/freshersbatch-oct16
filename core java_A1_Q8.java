import java.util.Scanner;
class BSortArray
{
	public static void main(String []args) 
	{
		int i, j, temp;
		Scanner myObj = new Scanner(System.in);
		int array[] = new int[15];
		System.out.println("Enter " + array.length + " integers");
		for (i = 0; i < array.length; i++) 
		{
		      array[i] = myObj.nextInt();
		}
		for (i = 0; i < ( array.length - 1 ); i++) 
		{
			for (j = 0; j < array.length - i - 1; j++)
			{
				if (array[j] > array[j+1]) 
				{
					temp       = array[j];
					array[j]   = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted list of numbers");
		for (i = 0; i < array.length; i++) 
		{
		      System.out.println(array[i]);
		}
	}
}

