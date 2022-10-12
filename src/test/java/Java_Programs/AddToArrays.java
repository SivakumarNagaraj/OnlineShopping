package Java_Programs;

import java.util.ArrayList;

public class AddToArrays {

	public static void main(String[] args) {
		int[] arr1= {2,3,1,5,2};
		int[] arr2= {1,4,3,2};
		int[] add=new int[arr1.length];
		int sum=0;
		ArrayList<Object> list= new ArrayList<Object>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i; j <= arr2.length; j++) {
				add[sum]=arr1[i]+arr2[j];
				list.add(add[sum]);
				break;
			}	
		}
		System.out.println(list);
	}
}
