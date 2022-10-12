package Java_Programs;

public class FirstMaxWithoutUsingSort {

	public static void main(String[] args) {
		int[] arr = { 20, 50, 40, 80, 10 };
		int fmax=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>fmax) {
				fmax=arr[i];
			}
		}
		System.out.println(fmax);
	}
}
