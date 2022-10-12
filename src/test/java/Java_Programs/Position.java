package Java_Programs;


public class Position {

	public static void main(String[] args) {
		int[] a= {2,4,1,1,5,4};
		int length = a.length;

		for (int j = 0; j < length; j++) {
			System.out.println(a[j]+" "+"Position is " +(j+1));
		}
	}
}
