package Java_Programs;

public class SumOftheNumberWithoutUsingLoop {
	public static void main(String[] args) {
		
		int n = 567855;
		int sum=0;
		//sum=sum+rem;
				
		if (n != 0) {
			sum = n%10 + (n/10)%10 + (n/100)%10 +(n/1000)%10 +(n/10000)%10 +(n/100000)%10;
		}
		System.out.println(sum);
		
	}
}


