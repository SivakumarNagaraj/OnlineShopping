package Java_Programs;

public class SwapTheNumber {

	public static void main(String[] args) {
// with using third variable
		int a=30;
		 int b=20;
		 int temp;
		 temp=a;
		 a=b;
		 b=temp;
		 System.out.println(a);
		 System.out.println(b);
		 
		 
// with out using third varianle
		 
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 System.out.println(a);
		 System.out.println(b);
		 
		 
	}
}
