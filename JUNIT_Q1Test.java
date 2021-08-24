import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinMaxFinderTest {

	@Test
	void test0() 
	{
		int[] a = {1,2,3,4};
		int[] f= new int[2];
		int[] f1 = {1,4};
		MinMaxFinder.findMinMax(a,f, a.length);
		assertArrayEquals(f1,f,"The arrays are not equal");
	}
	@Test
	void test1() 
	{
		int[] a = {3,4,17,8,2};
		int[] f= new int[2];
		int[] f1 = {2,17};
		MinMaxFinder.findMinMax(a,f, a.length);
		assertArrayEquals(f1,f,"The arrays are not equal");
	}
	@Test
	void test2() 
	{
		int[] a = {111,1111,11,1,11111};
		int[] f= new int[2];
		int[] f1 = {1,11111};
		MinMaxFinder.findMinMax(a,f, a.length);
		assertArrayEquals(f1,f,"The arrays are not equal");
	}

}
