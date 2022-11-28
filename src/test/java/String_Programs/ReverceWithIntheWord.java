package String_Programs;

import org.testng.annotations.Test;

public class ReverceWithIntheWord {

	public static void main(String[] args) {
		String s = "my name is siva";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i];
			for (int j = s2.length() - 1; j >= 0; j--) {
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		}
	}

	@Test
	public void reverse() {

		String s = "my name is siva";
		String[] s1 = s.split(" ");

		for (int i = 0; i < s1.length; i++) {
			if (s1[i].equals("siva")) {
				String s2 = s1[i];
				for (int j = s2.length() - 1; j >= 0; j--) {
					System.out.print(s2.charAt(j));
				}
			} else {
				System.out.print(s1[i] + " ");
			}
		}
	}
}