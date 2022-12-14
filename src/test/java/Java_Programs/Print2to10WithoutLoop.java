package Java_Programs;


public class Print2to10WithoutLoop {
	
	public static void print(int n)
	{
		if (n<=10) {
			System.out.println(n);
			n++;
			print(n);
			
		}
	}
	public static void main(String[] args) {
		print(2);
	}
		
}
