package Java_Programs;

public class FindMaxLengthInIntegerArray {

	public static void main(String[] args) {
		String[] s= {"987181","5641","681176541654","12"};
		String maxlength = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()>maxlength.length()) {
				maxlength=s[i];
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length()==maxlength.length()) 
			{
				System.out.println(maxlength);
			}
		}
	}
}
