package Assignment_Programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class Occurence {

	@Test
	public void OccurenceOfEachNumber() {

		int[] a = { 4, 3, 2, 3, 1 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer in : set) {
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if (in == a[i]) {
					count++;
				}
			}
			System.out.println(in+" is repeting "+ count +" times");
		}

	}
}
