package sandeepalgo.com;
import java.util.*;
import java.util.Scanner;

public class HackerRank_4 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ? ?");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		long result=integr(arr);
		System.out.println(result);
	}

	private static long integr(int[] arr) 
	{
		 long sum=0;
         int length=arr.length;
         for(int i=0;i<length;i++)
         {
             sum=sum+arr[i];
         }
         return sum;
	}

}
/*
Enter Array Length ? ?
5
1000000001
1000000002
1000000003
1000000004
1000000005
5000000015
*/