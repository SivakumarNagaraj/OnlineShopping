package Mock;

import org.testng.annotations.Test;

public class SquereOfno {
	@Test
	public void p() {
		
		String s="a1b2c3";
		int temp=0;
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='0' && ch<='9') {
				int no = ch-48;
				temp=no*no;
			}
			sum=sum+temp;
			temp=0;
		}
		System.out.println(sum);
	}

}
