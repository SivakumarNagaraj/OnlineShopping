package String_Programs;

import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class PositionOfWords {
	@Test
	public void Position() {

		String s = "i love love i bangalore city";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i] + " Position is " + (i + 1));
		}

	}
	@Test
	public void Position1() {
		String s = "i love love i bangalore city";
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) {
			set.add(s1[i]);
		}
		for (String str : set) {
			for (int i = 0; i < s1.length; i++) {
				if (str==(s1[i])) 
				{
					System.out.println(str+" is present in "+(i+1)+" position");
				}
			}
		}

	}

}
