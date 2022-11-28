package JavaPractices;


public class sample {

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int fmax = arr[0];
		int smax = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if (fmax<arr[i]) {
				
				if (fmax!=arr[i]) {
					smax=fmax;
				}
				fmax=arr[i];
			}
			else if (smax<arr[i]||fmax==smax) {
				smax=arr[i];
			}
		}
			System.out.println(smax);
	}
}
