package sandeepalgo.com;
import java.util.*;
public class ListInteger
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenght");
		int length=sc.nextInt();
		ArrayList a=new ArrayList(length);
		for(int i=0;i<length;i++)
		{
			int j=sc.nextInt();
			a.add(j);
		}	
		System.out.println(a);
		
		System.out.println("Enter the lenght");
		int length1=sc.nextInt();
		ArrayList b=new ArrayList(length);
		for(int i=0;i<length;i++)
		{
			int j=sc.nextInt();
			b.add(j);
		}
		System.out.println(b);
		
		
	}
}
/*
Enter the lenght
5
1
2
3
4
5
[1, 2, 3, 4, 5]
Enter the lenght
5
1
2
3
4
5
[1, 2, 3, 4, 5]
*/