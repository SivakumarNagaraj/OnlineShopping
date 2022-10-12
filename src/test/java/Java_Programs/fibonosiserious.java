package Java_Programs;

public class fibonosiserious {

	public static void main(String[] args) {
		int fib1=0;
		int fib2=1;
		int sum=0;
		System.out.print(fib1+" "+fib2);
		for (int i = 0; i < 10; i++) {
			sum=fib1+fib2;
			System.out.print(","+sum);
			fib1=fib2;
			fib2=sum;
			
		}
	}
}
