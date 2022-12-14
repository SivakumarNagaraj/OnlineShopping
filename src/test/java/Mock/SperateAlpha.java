package Mock;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class SperateAlpha {

	@Test
	public void Alpha() {
		//input : aaBabcDaA ....output: B
		String s="aaBabcDaA";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for (Character ch : set) {
			int count=1;
			if (ch>='a' && ch<='z') {
				set.contains((char)ch-32);
				count++;
			}
			if (count==2) {
				System.out.println(ch);
			}
			
		}
		
	}
}




//if (s.contains(s.charAt(i)+32+""))