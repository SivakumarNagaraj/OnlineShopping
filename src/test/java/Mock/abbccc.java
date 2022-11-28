package Mock;

public class abbccc {

	public static void main(String[] args) {
		
		String s="a1b2c3d4";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='0' && ch<='9')
			{
				int n=ch-48;
				for (int j = 0; j < n; j++) {
					s1=s1+s.charAt(i-1);
				}
			}
		}
		System.out.println(s1);
	}
}
	

