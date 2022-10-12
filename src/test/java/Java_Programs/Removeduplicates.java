package Java_Programs;

import java.util.LinkedHashSet;

public class Removeduplicates {
	
public static void main(String[] args) {
	int[] a= {2,4,1,1,5,4};
	LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
	for (int i = 0; i < a.length; i++) {
		set.add(a[i]);
	}
	System.out.println(set);
}
}
