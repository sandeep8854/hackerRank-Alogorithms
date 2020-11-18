package sandeepalgo.com;
import java.util.*;
import java.util.Scanner;

public class HackerRank_5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Matrix to find the Digonal Difference ? ?");
		int N=sc.nextInt();
		int sum=0;
		int arr[][]=new int[N][N];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				arr[i][j]=sc.nextInt();
				if(arr[i][j] >= -100 && arr[i][j] <=100)
				{
					if(i==j)
					{
						sum=sum-arr[i][j];
					}
					 if((i+j)==N-1)
	                    {
	                    sum=sum+arr[i][j];
	                   }
				}
			}
		}
		 System.out.println(Math.abs(sum));
		
		
		
	}

}
