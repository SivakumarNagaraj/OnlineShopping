package Java_Programs;

public class FindMinLengthInIntegerArray {
public static void main(String[] args) {
	
	String[] s= {"987181","5641","681176541654","12"};
	String minlength = s[0];
	for (int i= 0; i < s.length; i++) {
		if (s[i].length()< minlength.length()) {
			minlength=s[i];
		}
	}
//	for (int i = 0; i < s.length; i++) {
//		if (s[i].length()==minlength.length()) {
			System.out.println(minlength);
		}
//	}
}
//}
