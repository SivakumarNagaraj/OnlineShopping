package Collections;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer,String>();
		map.put(10, "Hi");
		map.put(20, "Hellow");
		map.put(10, "Hellow");
		map.put(3, "Hellow");
		map.put(5, "Bye");
		System.out.println(map);
		System.out.println(map.remove(20));
		System.out.println(map.containsKey(5));
		System.out.println(map.contains("Bye"));
		System.out.println(map.replace(5, "Super"));
		System.out.println(map.get(10));
		System.out.println(map);
	}
}
