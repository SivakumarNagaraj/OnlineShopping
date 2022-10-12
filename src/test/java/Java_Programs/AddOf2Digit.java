package Java_Programs;

public class AddOf2Digit {
	public static void main(String[] args) {
		String s = "K;Ld!A66ej11w22";
		int sum = 0;
		int temp = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='0' && ch<='9') {
				int n=ch-48;
				temp=temp*10+n;
			}
			else {
				sum=sum+temp;
				temp=0;
			}
		}
		sum=sum+temp;
		System.out.println(sum);
	}
}