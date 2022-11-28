package Java_Programs;

public class AddDiagonalNo {
	
	public static void main(String[] args) {
		int sum=0;
		int[][] a= {{1,2,3}, {4,5,6}, {7,8,9}};
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i][i];
		}
		System.out.println(sum);
	}

}
