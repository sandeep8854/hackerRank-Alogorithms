package sandeepalgo.com;
import java.util.Scanner;
public class Hackerank_1 
{
	static int solvemeFirst(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter a and b value ??");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum=solvemeFirst(a,b);
		System.out.println(sum);
	}
}
/*
Enter a and b value ??
4
6
10
*/