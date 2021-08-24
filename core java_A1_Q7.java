import java.util.Scanner;
public class SearchInt 
{
	public static void main(String[] args)
	{
		int i, j, temp;
		Scanner myObj = new Scanner(System.in);
		int array[] = new int[5];
		System.out.println("Enter the array elements:");
		for (i = 0; i < array.length; i++) 
		{
		      array[i] = myObj.nextInt();
		}
		System.out.println("Enter the element to be searched");
		temp = myObj.nextInt();
		for (i = 0; i < array.length; i++)
		{
			if(array[i]==temp)
			{
				System.out.println("the number is at index " +i);
				temp=0;
			}
			
		}
		if(temp!=0)
		{
			System.out.println("Element does not exist in the array ");	
		}
	}
}
