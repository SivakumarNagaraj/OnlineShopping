package Java_Programs;

public class AddOf2ArrayAndSplitNo {
	
	public static void main(String[] args) {
		int[] a= {1,2,1};
		int[] b= {7,8,7,2};
		
		int length = a.length;
		if (a.length<b.length) {
			 length = b.length;
		}
		for (int i = 0; i < length; i++) {
			try {
				int c=a[i]+b[i];
				if (c>9&&c<100) {
					int rem = c%10;
					int n = c/10;
					System.out.print(n+",");
					System.out.print(rem+",");
				}
				else if (c>99&&c<1000) {
					int rem = c%100;
					int n = c/100;
					System.out.print(n+",");
					if (rem>9&&rem<100) {
						int rem1 = rem%10;
						int n1 = rem/10;
						System.out.print(n1+",");
						System.out.print(rem1+",");
					}
				}
				else {
					System.out.print(a[i]+b[i]+",");
				}
			} catch (Exception e) {
				if (a.length<b.length) {
					System.out.print(b[i]);
				} else {
					System.out.print(a[i]);
				}
			}
		}
	}

}
