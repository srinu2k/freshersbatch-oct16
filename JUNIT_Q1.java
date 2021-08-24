import java.util.*;
public class MinMaxFinder 
{
	public static int[] findMinMax(int[] arr,int[] fa, int n)
	{
		Arrays.sort(arr);
		n= arr.length;
		fa[0] = arr[0];
		fa[1] = arr[n-1];
		return fa;
	}

	public static void main(String[] args)
	{
		int[] a = {1,2,3,4};
		int[] f= new int[2];
		findMinMax(a,f, a.length);
		for(int i=0;i<2;i++)
		System.out.print(f[i]+"\t");
		
	}

}
