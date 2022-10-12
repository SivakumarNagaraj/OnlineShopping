package Java_Programs;

public class ThirdMinWithoutUsingSort {

	public static void main(String[] args) {
		int[] arr= {1,55,2,59,88,55,42,42};
		int fmin = arr[0];
		int smin = arr[0];
		int tmin = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<fmin)
			{
				if (arr[i]!=fmin)
				{
					smin=fmin;	
				}
				fmin=arr[i];
			}
			else if (fmin==smin || arr[i]<smin)
			{
				if(arr[i]!=smin) {
				tmin=smin;
				}
				smin=arr[i];
			} 
			else if (smin==tmin || arr[i]<tmin)
			{
				tmin=arr[i];
			} 
		}
		
		System.out.println("Third min value "+tmin);

	}
}
