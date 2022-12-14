package Mock;

import org.testng.annotations.Test;

public class reverseString {

	@Test
	public void reverse() {
		String s="siva";
		String rev="";
		for (int i = 0; i > -(s.length()); i--) {
			rev=s.charAt(-(i))+rev;
		}
		System.out.println(rev);
	}
}
