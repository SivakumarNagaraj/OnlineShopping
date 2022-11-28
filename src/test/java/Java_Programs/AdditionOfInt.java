package Java_Programs;

public class AdditionOfInt {
	public static void main(String[] args) {
		String s="K;Ld!A65ejw0";
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			System.out.println(ch);
			if (ch>='0' && ch<='9') {
				int n = ch-48;
				//int b = Integer.parseInt(String.valueOf(ch));	
				sum=sum+n;
			}
		}
		System.out.println(sum);
	}
}
