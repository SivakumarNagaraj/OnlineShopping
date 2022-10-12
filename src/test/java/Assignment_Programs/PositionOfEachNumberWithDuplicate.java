package Assignment_Programs;

import org.testng.annotations.Test;

public class PositionOfEachNumberWithDuplicate {

	@Test
	public void position() {
		int[] a = { 4, 3, 2, 3, 1 };
		int length = a.length;

		for (int j = 0; j < length; j++) {
			System.out.println(a[j]+" "+"Position is " +(j+1));
		}
	}
}

