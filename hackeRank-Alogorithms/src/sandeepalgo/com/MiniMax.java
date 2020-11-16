package sandeepalgo.com;
import java.util.*;
public class MiniMax 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Length ?");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		miniMax(arr);	
	}
	private static void miniMax(int[] arr) 
	{
		 int min=arr[0];
         int max=arr[0];
         long sum=0;
         
         for(int i=0;i<arr.length;i++)
         {
        	 sum=sum+arr[i];
        	 if(arr[i]<min)
             {
                 min=arr[i];
             }
             if(arr[i]>max)
             {
                 max=arr[i];
             }
         }
         System.out.println((sum-max)+ " "+(sum-min));
	}
}
/*
 * Enter Any Length ?
5
1
2
3
4
5
10 14
*/
