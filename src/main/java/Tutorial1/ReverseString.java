package Tutorial1;

public class ReverseString {

	public static void main(String[] args) {
		String a="adinath kishanrao malande";
		int b=a.length();
		for(int i=b-1;i>=0;i--)
		{
			System.out.print(a.charAt(i));
		}
	}

}
