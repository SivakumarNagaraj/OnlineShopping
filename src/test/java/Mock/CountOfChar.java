package Mock;

public class CountOfChar {
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="sivakumar";
		String s1="";
		for (int i=0;i<s.length() ;i++ )
		{
		    int count=0;
		   Character ch=s.charAt(i);
		   if (!s1.contains(ch+"")) 
		   {
			   s1=s1+ch;
		       count++;
		   }
		   else
		   {
		       count=count+2;
		   }
		   System.out.println(ch+" "+count);
		}
	}

}
