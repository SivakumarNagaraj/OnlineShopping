package Mock;

import java.util.Iterator;

import org.testng.annotations.Test;

public class ReveseString1 {

	@Test
	public void string() {
		
		String s="i love india";
		String s1 = s.replace(" ", "");
//		System.out.println(s1);
		String rev="";
		for (int i = 0,j=s1.length()-1; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				rev=rev+s1.charAt(j);
				j--;
			}else {
				rev+=s.charAt(i);
			}
		}
		System.out.println(rev);
	}
}
