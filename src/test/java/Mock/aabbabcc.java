package Mock;

import org.testng.annotations.Test;

public class aabbabcc {

	@Test
	public void aabbcc() {
		String s="aabbabcc";
		String s1="";
		int count=1;
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i)==s.charAt(i+1)) {
				count++;
			}
			else {
				s1=s1+s.charAt(i)+""+count;
				count=1;
			}
		}
		System.out.print(s1);
		System.out.print(s.charAt(s.length()-1)+""+count);
		
		
	}
}
