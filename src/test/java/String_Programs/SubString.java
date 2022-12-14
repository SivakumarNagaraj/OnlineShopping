package String_Programs;

import org.testng.annotations.Test;

public class SubString {
	
	@Test
	public void string() {
		
		String s="javajavajavasjjavajavaavaeleniumjavaseleniumjavajava";
		int count=0;
		String s1 = s.substring(0, 4);
		String s2 = s.substring(s.length()-s1.length(), s.length());
		for (int i = 0; i < s.length()-s1.length(); i++) {
			if (s1.equals(s.substring(i, i+s1.length()))) {
				count++;
			}
		
		}
//		System.out.println(count);
		if (s1.equals(s2)) {
			System.out.println(count+1);
		}
		else {
			System.out.println(count);
		}
		
	}

}
