package Collection;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Object> st = new Stack<Object>();
		st.push(20);
		st.push(30);//LastIn
		System.out.println(st.pop());//30   FirstOut
		System.out.println(st.pop());//20
	}
}
