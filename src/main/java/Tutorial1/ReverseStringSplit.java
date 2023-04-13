package Tutorial1;

public class ReverseStringSplit {

	public static void main(String[] args) {
		
		String a="adinath kishanrao malande";
		String []b=a.split(" ");
		
		String c="";
		for(int i=b.length-1;i>=0;i--)
		{
			for(int j=0;j<b[i].length();j++) 
			{
				c=b[i].charAt(j)+c;
			}
			c=""+c;
		}{
		System.out.println(c);
		}
		for(int i=b[0].length()-1;i>=0;i--)
		{
			System.out.println(b[0].charAt(i));
		}	
		for(int i=b[1].length()-1;i>=0;i--)
		{
			System.out.println(b[1].charAt(i));
		}
		for(int i=b[2].length()-1;i>=0;i--)
		{
			System.out.println(b[2].charAt(i));
		}
		
	

}}
