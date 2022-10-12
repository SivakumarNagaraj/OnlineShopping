package Assignment_Programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PositionOfEachNumberWithoutDuplicate {

	@Test
	public void position() {
		int[] a = { 4, 3, 2, 3, 1 };
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			set.add(a[i]);
		}
		for (Integer in : set) {
			for (int i = 0; i < a.length; i++) {
				if (in==a[i]) {
					System.out.println(in + " " + (i + 1));
					break;
				}
			}
		}
	}
}
