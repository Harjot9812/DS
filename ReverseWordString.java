public class ReverseWordString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" The sky is blue ";
		
		reversewords(s);
	}
	public static void reversewords(String s)
	{
		StringBuilder str=new StringBuilder();
		int i=s.length()-1;
		while(i>=0)
		{
			while(i>=0 && s.charAt(i)==' ')
			{
				i--;
			}
			int j=i;
			// taking it till it reaches space
			while(i>=0 && s.charAt(i)!=' ')
			{
				i--;
			}
			if(s.isEmpty())
			{
				str.append(s.substring(i+1, j+1));
			}
			else
			{
				str.append(" "+ s.substring(i+1, j+1));
			}
		}
		System.out.println(str);
	}
}
