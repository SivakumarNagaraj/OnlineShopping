package Mock;

public class MissingNumber {
	public static void main(String[] args) throws java.lang.Exception {

		int[] a = { 2, 4, 12, 16, 20 };
		for (int i = 0; i < a.length - 1; i++) {
			int count = 2;
			int no = a[i + 1] - a[i];
			while (no > 2) {
				int mis = a[i] + count;
				System.out.print(mis + " ");
				no = no - 2;
				count = count + 2;
			}
		}

	}

}
