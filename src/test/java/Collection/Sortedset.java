package Collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sortedset {

	public static void main(String[] args) {
		 SortedSet<String> set = new TreeSet<>();
		set.add("Info");
		set.add("IBM");
		set.add("wipro");
		set.add("google");
		set.add("MS");
		set.add("MS");
		System.out.println(set);

		for (Object object : set) {
			System.out.println(object);
		}
		System.out.println();
		System.out.println(set.first());

		System.out.println(set.last());
		System.out.println(set.headSet("MS"));
		System.out.println(set.tailSet("MS"));

		
	
	}
}
