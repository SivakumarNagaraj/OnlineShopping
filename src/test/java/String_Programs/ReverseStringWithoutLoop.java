package String_Programs;

import org.testng.annotations.Test;

public class ReverseStringWithoutLoop {

	@Test
	public void reverse() {
		String s="siva";
		String rev=reverse(s);
		System.out.println(rev);
	}

	private String reverse(String s) {
		if (s.length()-1<1) {
			return s;
		} else {
			String s1=s.charAt(s.length()-1)+reverse(s.substring(0, s.length()-1));
			return s1;

		}
	}
}
