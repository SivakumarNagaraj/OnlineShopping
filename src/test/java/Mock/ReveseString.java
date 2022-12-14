package Mock;


import org.testng.annotations.Test;

public class ReveseString {

	@Test
	public void reverse() {
		String s="welcome to india";
		String[] s1 = s.split(" ");
		String rev = "";
		for (int i = 0; i < s1.length; i++) {
			for (int j = s1[i].length()-1; j >= 0; j--) {
				char ch = s1[i].charAt(j);
				rev=rev+ch;
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}
}
