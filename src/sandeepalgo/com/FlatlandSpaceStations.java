package sandeepalgo.com;
import java.util.*;
public class FlatlandSpaceStations 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Cities ? ");
		int nCitites=sc.nextInt();
		System.out.println("Enter Number of space Station ?");
		int spS=sc.nextInt();
		int arr[]=new int[spS];
		for(int i=0;i<spS;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result=flateland(arr,nCitites);
		System.out.println(result);
	}
	private static int flateland(int[] arr, int nCitites)
	{
		Arrays.sort(arr);
	    int maxDistance = arr[0];
	    for(int i = 1; i < arr.length; i++)
	    {
	        int distance = (arr[i] - arr[i-1]) / 2;
	        if(maxDistance < distance) 
	        	  maxDistance = distance;
	    }
	    int lastGap = (nCitites-1) - arr[arr.length - 1];
	    return (lastGap < maxDistance) ? maxDistance : lastGap;	
	}
}
/*
Enter Number Of Cities ? 
5
Enter Number of space Station ?
2
0
4
2
*/
/*Enter Number Of Cities ? 
6
Enter Number of space Station ?
6
0
1
2
3
4
5
0
*/
