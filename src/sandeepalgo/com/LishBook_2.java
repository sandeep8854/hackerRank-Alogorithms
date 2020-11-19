package sandeepalgo.com;
import java.util.*;
public class LishBook_2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Chapter ?");
		int chapter=sc.nextInt();
		System.out.println("Enter Your Problem per page");
		int maxProblemPerPage=sc.nextInt();
		
		int arr[]=new int[chapter];
		for(int i=0;i<chapter;i++)
		{
			arr[i]=sc.nextInt();
		}
		int result = 0;
        int page = 1;
		
     // chapter
        for(int i = 0; i < arr.length; i++) 
        {
            int problems = arr[i];
            
        //problem
            for(int prob=1;prob<=problems;prob++)
            {
            	if(prob==page)
            	{
            		result++;
            	}
            	
                if((prob % maxProblemPerPage == 0) || prob == problems)
                {
                	page++;
                }	
            }
	}
        System.out.println(result);
	
	}
}
