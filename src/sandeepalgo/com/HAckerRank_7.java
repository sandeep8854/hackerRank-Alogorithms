package sandeepalgo.com;
import java.util.*;
public class HAckerRank_7
{
	public static void main(String[] sandeep) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Length of *  ? ");
		int N=sc.nextInt();
		staircast(N);
		
	}

	private static void staircast(int n)
	{
		 for(int i=1;i<=n;i++)
         {
             for(int j=1;j<=n-i;j++)
             {
                 System.out.print("");
                
             }
             for(int j=1;j<=i;j++)
             {
                 System.out.print("#");
             }
              System.out.println();

         }
	}
}
