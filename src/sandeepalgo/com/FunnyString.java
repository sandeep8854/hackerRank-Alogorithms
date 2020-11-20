package sandeepalgo.com;
import java.util.*;
public class FunnyString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String Number ?");
		int num=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			String n=sc.next();
			String result=funny_str(n);
			System.out.println(result);
		}
	}

	private static String funny_str(String str)
	{
		String strrev=new String(new StringBuilder(str).reverse());
		int strArr[]=new int[strrev.length()-1];
		int revArr[]=new int[strrev.length()-1];
		for(int i=0;i<str.length()-1;i++)
		{
			strArr[i]=(int)Math.abs(str.charAt(i)-str.charAt(i+1));
			revArr[i]=(int)Math.abs(strrev.charAt(i)-strrev.charAt(i+1));
			if(strArr[i]!=revArr[i])
				return "Not Funny";
		}
		return "Funny";
	}
}
