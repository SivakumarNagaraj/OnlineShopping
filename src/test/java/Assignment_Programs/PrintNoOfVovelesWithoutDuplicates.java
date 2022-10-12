package Assignment_Programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PrintNoOfVovelesWithoutDuplicates {

	@Test
	public void voveles() {
		String s = "india";
		int count = 0;
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < ch.length; i++) {
			set.add(ch[i]);
		}			
		for (Character cha : set) 
		{
				if (cha == 'a' || cha == 'e' || cha == 'i' || cha == 'o' || cha == 'u') {
					count++;
					System.out.println(cha+" ");
				}
			}
			System.out.println("Vovel count is "+count);
		}
	
	}
