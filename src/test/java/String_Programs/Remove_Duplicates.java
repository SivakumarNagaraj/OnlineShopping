package String_Programs;

import java.util.LinkedHashSet;

public class Remove_Duplicates {

	public static void main(String[] args) {
		String s="tester";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			set.add(s.charAt(i));
		}
		System.out.println(set);
//		for (Object ch : set) {
//			
//		}
	}
}
