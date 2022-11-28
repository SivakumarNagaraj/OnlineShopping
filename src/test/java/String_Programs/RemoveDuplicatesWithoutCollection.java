package String_Programs;

public class RemoveDuplicatesWithoutCollection {

	public static void main(String[] args) {
		String s="kummar";
		String rem="";
		for (int i = 0; i < s.length(); i++) {
			if (!rem.contains(s.charAt(i)+"")) {
			
				rem=rem+s.charAt(i);
			}
		}
		System.out.println(rem);
	}
}
