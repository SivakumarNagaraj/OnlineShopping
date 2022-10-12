package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	 
public static void main(String[] args) {
	HashSet<Object> set = new HashSet<Object>();
	set.add("Hello");
	set.add("Hi");
	set.add(30);
	set.add(null);
	set.add(null);
	System.out.println(set);
//	System.out.println(set.remove(30));
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
