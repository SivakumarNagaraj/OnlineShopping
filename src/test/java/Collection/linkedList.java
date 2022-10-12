package Collection;

import java.util.LinkedList;

public class linkedList {

	public static void main(String[] args) {
		LinkedList<Object> list = new LinkedList<Object>();
		list.add(10);
		list.add(20);
		list.add("hi");
		list.add("Hellow");
		list.add(null);
		list.add(null);
		list.add(10);
		list.add(20);
		list.add(30);
		list.addFirst("Kumar");
		list.addLast("Siva");
		System.out.println(list);
//		System.out.println(list.getFirst());
//		System.out.println(list.getLast());
//		System.out.println(list.get(1));
//		System.out.println(list.removeFirst());
//		System.out.println(list);
//		System.out.println(list.remove(3));
//		System.out.println(list);
//		System.out.println(list.removeLast());
//		System.out.println(list);
//		System.out.println(list.removeLastOccurrence(20));//In order to remove the value
//		System.out.println(list);

		LinkedList<Object> list1 = new LinkedList<Object>();
		list1.add(30);
		list1.add("hi");
		list1.add(10);
		list1.add(5);
		System.out.println(list1);
//		list1.retainAll(list);// it will fetch the common value
//		System.out.println(list1);
		list1.removeAll(list);
		System.out.println(list1);
//		System.out.println(list1);
//		list.addAll(list1);
//		for (Object ob : list) {
//			System.out.println(ob);
//		}
	}
}
