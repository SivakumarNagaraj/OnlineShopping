package Java_Patrens;

public class Dimond {
	public static void main(String[] args) {
		
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = i; j<=n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <=i ; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 4; i >0; i--) {
			for (int j = 5; j>0; j--) {
				if (i>=j) {
					System.out.print(" *");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}

}
