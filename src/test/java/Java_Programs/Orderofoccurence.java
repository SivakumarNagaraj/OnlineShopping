package Java_Programs;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Orderofoccurence {

	public static void main(String[] args) {
		int[] a= {2,4,1,1,5,4};
		int length = a.length;
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer,Integer>();
		for (int i = 0; i < length; i++)
		{
			if (!map.containsKey(a[i])) 
			{
				map.put(a[i], 1);
			}
			else 
			{
				int count = map.get(a[i]);
				map.put(a[i], count+1);
			}
		}
		for (Entry<Integer, Integer> i : map.entrySet()) 
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}
}
