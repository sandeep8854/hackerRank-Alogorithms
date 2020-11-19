package sandeepalgo.com;
import java.util.*;
public class FairRations 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any N ?");
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<N;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<N-1;i++)
		{
			if(arr[i]%2!=0)
			{
				arr[i+1]++;
				count=count+2;
			}
		}
		if(arr[N-1]%2==0)
		{
			System.out.println(count);
		}
		else
			System.out.println("NO");	
	}
}
/*
Enter Any N ?
2
1
2
NO
........
Enter Any N ?
5
2
3
4
5
6
4

*/