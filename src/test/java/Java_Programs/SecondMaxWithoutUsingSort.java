package Java_Programs;


public class SecondMaxWithoutUsingSort {

	public static void main(String[] args) {
		int[] arr= {1,55,55,2,59,88,55,42,42};
		int fmax = arr[0];
		int smax =arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>fmax)
			{
				if (arr[i]!=fmax)
				{
				smax=fmax;	
				}
				fmax=arr[i];
			}
			else if (fmax==smax || arr[i]>smax)
			{
				smax=arr[i];
			} 
		}
		System.out.println("First max value "+fmax);
		System.out.println("Second max value "+smax);

	}
}
