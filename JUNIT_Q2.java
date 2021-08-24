import java.util.*;
public class JUNIT_Q2 
{
	public static void findMinMax(int[] arr,int[] fa, int n)
	{
		Arrays.sort(arr);
		n= arr.length;
		fa[0] = arr[0];
		fa[1] = arr[n-1];
		System.out.print(fa[0]+fa[1]);
		
	}

	public static void main(String[] args)
	{
		int[] a = {1,2,3,4};
		int[] f= new int[2];
		findMinMax(a,f, a.length);
		
		
	}

}
