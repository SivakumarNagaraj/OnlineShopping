package Mock;

import org.testng.annotations.Test;

public class SeprateInput {

	@Test
	public void input() {
		//(input : aababbaa....output : aa,ab,ba,ab,bb,ba,aa)
		String s="aababbaa";
		String s1="";
		for (int i = 0; i < s.length()-1; i++) {
			
			s1=s1+(s.substring(i, i+2))+",";
		}
		
		System.out.println(s1);
		
	}
}
