package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(10, "Hi");
		map.put(20, "Hellow");
		map.put(10, "Hellow");
		map.put(3, "Hellow");
		map.put(null, "Siva");
		map.put(null, "Kumar");
		map.put(5, "Bye");
		map.put(4, null);
		map.put(2, null);
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map.containsKey(5));
		System.out.println(map.replace(5, "Super"));
		System.out.println(map.get(10));
		System.out.println(map);
		for ( Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
