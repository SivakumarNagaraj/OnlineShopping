package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		LinkedHashSet<Object> set = new LinkedHashSet<Object>();
		set.add("Hello");
		set.add("Hi");
		set.add(30);
		set.add(30);
		set.add(null);
		set.add(null);
		System.out.println(set);
		if (set.contains("Hi")) {
			System.out.println("Present");
		} else {
			System.out.println("Not Present");
		}
		for (Object object : set) {
			System.out.println(object);
		}
		System.out.println();
		
		Iterator<Object> i = set.iterator();
		while(i.hasNext());
		{
			System.out.println(i.next());
		}
	}
}
