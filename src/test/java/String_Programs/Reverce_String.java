package String_Programs;


public class Reverce_String {

	public static void main(String[] args) {
//		String s = "welcome";
//		String rev = "";
//		for (int i = s.length() - 1; i >= 0; i--) {
//			rev = rev + s.charAt(i);
//		}
//		System.out.println(rev);
		
//		String s = "welcome";
//		char[] s1 = s.toCharArray();
//		for (int i = s1.length-1; i >=0; i--) {
//			System.out.print(s1[i]);
//		}
		
		
//		String s = "welcome";
//		int count = 0;
//		char[] s1 = s.toCharArray();
//		for (char c : s1) {
//			count++;
//		}
//		for (int i = count-1; i >=0; i--) {
//			System.out.print(s1[i]);
//		}
		
//		String s = "welcome";
//		StringBuffer s1 = new StringBuffer(s);
//		s1.reverse();
//		System.out.println(s1);
		
		String s = "welcome";
		StringBuilder s1 = new StringBuilder(s);
		s1.reverse();
		System.out.println(s1);
		
		
	}
}
