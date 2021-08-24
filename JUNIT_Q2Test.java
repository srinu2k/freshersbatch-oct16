import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNIT_Q2Test {
	@Test
	void test0() 
		{
			int[] a = {1,2,3,4};
			int[] f= new int[2];
			int b= 5;
			JUNIT_Q2.findMinMax(a,f, a.length);
			assertEquals(b,(f[0]+f[1]),"Not found min+max of the array");
		}
		@Test
		void test1() 
		{
			int[] a = {34,56,21,3,0};
			int[] f= new int[2];
			int b= 56;
			JUNIT_Q2.findMinMax(a,f, a.length);
			assertEquals(b,(f[0]+f[1]),"Not found min+max of the array");
		}
		@Test
		void test2() 
		{
			int[] a = {221,21,3,45,7};
			int[] f= new int[2];
			int b= 224;
			JUNIT_Q2.findMinMax(a,f, a.length);
			assertEquals(b,(f[0]+f[1]),"Not found min+max of the array");
		}

}
