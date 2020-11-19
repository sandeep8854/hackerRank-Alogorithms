package sandeepalgo.com;
import java.util.*;
public class LishWorkBook
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Chapter ? ?");
		int chapter=sc.nextInt();
		System.out.println("Enter Number of Problem/page ?");
		int problem=sc.nextInt();
		int spacialProblem=0;
		int noOfPages=0;
		for(int i=0;i<chapter;i++)
		{
			System.out.println("Enter number of problem in chapter ?");
			int chapterproblem=sc.nextInt();
			int pgno=noOfPages+1;
			int count=0;
			for(int j=1;j<=chapterproblem;j++)
			{
				if(j==pgno)
					spacialProblem++;
				if(j%problem==0 && j<chapterproblem)
				{
					pgno++;
					
				}
			}
			
			noOfPages=pgno;	
		}
		System.out.println(spacialProblem);
	}
}
/*
Enter Number of Chapter ? ?
5
Enter Number of Problem/page ?
3
Enter number of problem in chapter ?
4
Enter number of problem in chapter ?
2
Enter number of problem in chapter ?
6
Enter number of problem in chapter ?
1
Enter number of problem in chapter ?
10
4*/