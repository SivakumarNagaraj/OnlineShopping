package String_Programs;

import java.util.LinkedHashSet;

public class Position {

	public static void main(String[] args) {

		String s = "tester";
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			for (int i =s.length()-1; i >=0 ; i--) {
				if (ch == s.charAt(i)) {
					System.out.println(ch + " " + (i + 1));
					break;
				}
			}
		}

	}
}
