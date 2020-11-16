package sandeepalgo.com;

import java.util.Scanner;

public class HackerRank_2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter Array length ?");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=sumOfArray(arr);
		System.out.println(result);
	}

	private static int sumOfArray(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
}
/*
Enter Array length ?
5
2
2
4
2
5
15
*/