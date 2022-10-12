package Java_Programs;

public class SeprateNumberAplSpecial {

	public static void main(String[] args) {
		String s="K;Ld!A65ejw0";
		String Specialchar = "";
		String Number = "";
		String Capital = "";
		String Small="";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch>='A' && ch<='Z') {
				Capital=Capital+ch;
				
			}
			else if (ch>='0' && ch<='9') {
				Number=Number+ch;
			}
			else if (ch>='a' && ch<='z') {
				Small=Small+ch;
			}
			else {
				Specialchar=Specialchar+ch;
			}
		}
		System.out.println(Specialchar+" "+Number+" "+Capital+" "+Small+" ");
		
	}
}
