package String_Programs;


public class ReverceWithIntheWord {

	public static void main(String[] args) {
		String s="my name is siva";
		String[] s1 = s.split(" ");
		for (int i=0; i<s1.length; i++)
		{
			String s2=s1[i];
			for (int j =s2.length()-1; j>=0; j--) 
			{
				System.out.print(s2.charAt(j));
			}
			System.out.print(" ");
		}
	}
}
