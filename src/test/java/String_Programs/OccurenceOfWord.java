package String_Programs;

import java.util.LinkedHashSet;

public class OccurenceOfWord {

	public static void main(String[] args) {
		String s="i love love i bangalore city";
		String[] s1 = s.split(" ");
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < s1.length; i++) 
		{
			set.add(s1[i]);
		}
		for (String st : set) {
			int count=0;
			for (int i = 0; i < s1.length; i++) {
				if (st.equals(s1[i])) 
				{
					count++;
				}
			}
			System.out.println(st+" is repeting "+ count +" times");
		}
		
	}
}
