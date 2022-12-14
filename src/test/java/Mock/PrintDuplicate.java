package Mock;

import org.testng.annotations.Test;

public class PrintDuplicate {

	@Test
	public void duplicate() {
		//(input : aba ...Output:a)

		String s="aba";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			if (!s1.contains(s.charAt(i)+"")) {
				s1=s1+s.charAt(i);
			}
			else {
				System.out.println(s.charAt(i));
			}
		}
		
	}
}

