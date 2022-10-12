package Java_Programs;


public class Seprate0and1 {

	public static void main(String[] args) {
		int[] arr= {2,2,2,2,1,2,1,2,1,2,1,2};
		int[] temp=new int[arr.length];
		int m=0;
		int n=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==2) 
			{
				temp[m]=2;
				m++;
			}
			else if (arr[i]==1) 
			{
				temp[n]=1;
				n--;
		}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i]+" ");
		}
	}
}
