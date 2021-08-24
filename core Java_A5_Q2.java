import java.util.*;
public class Java_A5_Q2 
{
	public static void main(String[] args) 
	{
		Map<Integer, Double> map= new HashMap<>();
		map.put(1,232.1);
		map.put(2,142.5);
		map.put(3,678.80);
		map.put(4,253.78);
		map.put(5,8936.90);
		map.put(6,245.89);
		map.put(7,523.6);
		map.put(8,655.890);
		map.put(9,383.988);
		map.put(10,1684.08);
		for(Map.Entry<Integer, Double> m: map.entrySet())
			System.out.println(m.getKey()+" - "+m.getValue());
	}
}