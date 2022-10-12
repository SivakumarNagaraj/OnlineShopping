package String_Programs;

public class Reverce_The_words {

	public static void main(String[] args) {
		String s="my name is siva";
		String[] s1 = s.split(" ");
		for (int i =s1.length-1;i>=0; i--) {
			System.out.print(s1[i]+" ");
		}
	}
}
