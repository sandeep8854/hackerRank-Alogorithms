package sandeepalgo.com;
import java.util.*;
public class StrangeCounter
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter T time ?");
		long T=sc.nextLong();
//		int count=0;
//		for(int i=1;i<=T;i++)
//		{
//			T=sc.nextInt();
//		}
	long result=strangeCounter(T);
	System.out.println(result);
	}

	private static long strangeCounter(long t) 
	{
	   long	 n = 2;
	   while (3 * (n - 1) < t)
		    n = 2 * n;
	   return(3 * (n - 1) - t + 1);	
	}
}
/*
Enter T time ?
4
6
*/