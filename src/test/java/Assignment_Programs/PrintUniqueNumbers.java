package Assignment_Programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PrintUniqueNumbers {

	@Test
	public void unique() {
		int[] a = { 4, 3, 2, 3, 1 };
		int length = a.length;
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < length; i++) {
			set.add(a[i]);
		}
		for (Integer in : set) {
			int count = 0;
			for (int i = 0; i < length; i++) {
				if (in == a[i]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(in + " ");
			}
		}
	}
}
