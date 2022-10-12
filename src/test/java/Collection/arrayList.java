package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<Object> list= new ArrayList<Object>();
		list.add(10);
		list.add(10);
		list.add(20);
		list.add("hi");
		list.add("Siva");
		list.add(null);
		list.add(null);
		System.out.println(list);
		list.add(3, "Hellow");
		System.out.println(list);
		ArrayList<Integer> list1= new ArrayList<Integer>();
		list1.add(50);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println(list1);


		
	}
}
