package sandeepalgo.com;
import java.util.*;
public class HackerRank_6
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Length ? ");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		pluseMinus(arr);	
	}

	private static void pluseMinus(int[] arr) 
	{
		int len=arr.length;
        float positiveCount=0;
        float negativeCount=0;
        float zeroCount=0;
        for(int i=0;i<len;i++)
        {
        	int element=arr[i];
        	if(element > 0)
        		positiveCount++;
        	else if(element < 0)
        		negativeCount++;
        	else if(element == 0)
        		zeroCount++;
        }
        System.out.println(positiveCount/arr.length);
        System.out.println(negativeCount/arr.length);
        System.out.println(zeroCount/arr.length);	
	}

}
/*
Enter Array Length ? 
6
-4
3
-9
0
4
1
0.5
0.33333334
0.16666667
*/