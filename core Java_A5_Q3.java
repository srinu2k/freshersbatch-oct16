import java.util.*;
public class Java_A5_Q3 
{	
	public static <T> void Exchange(T[] array, int i, int j)
	{
		T temp= array[i];
		array[i]=array[j];
		array[j]=temp;
	}
	public static <T> void display(T[] arr) 
	{
		for(T a: arr) {
			System.out.print(a+" ");
		}
	}
	public static void main(String[] args) 
	{
		Integer[] a= {24, 56, 47, 23, 0};
		String[] string= {"voilet", "Indigo", "blue", "green", "yellow","orange", "Red"};
		Exchange(a, 0,3);
		Exchange(string, 3, 6);
		System.out.println("Arrays after exchange");
		display(a);
		System.out.println("");
		display(string);
	}
}
