package Java_Programs;

public class FirstMaxAndMinValue {
	public static void main(String[] args) {
		int[] arr= {20,50,40,80,10};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i; j < arr.length; j++) 
			{
				if (arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
			System.out.println("First min value -------->" +arr[arr.length-1]);
			System.out.print("First max value -------->" +arr[0]);

	}

}
