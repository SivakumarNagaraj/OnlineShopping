package Java_Programs;

import java.util.Scanner;

public class Normal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number- ");
		int a = sc.nextInt();
		while (a != 0) {
			if (a % 5 == 0 && a % 3 == 0) {
				System.out.println("HiHello");
				break;
			} else if (a % 3 == 0 ) {
				System.out.println("Hello");
				break;

			} else if (a % 5 == 0 ) {
				System.out.println("Hi");
				break;

			} else if (a % 5 != 0 && a % 3 != 0) {
				System.out.println("Bye");
				break;

			}
		}
	}
}
