package sandeepalgo.com;
import java.util.*;
public class List
{
	//String in List...
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the world");
		ArrayList a=new ArrayList();
		for(int i=0;i<6;i++)
		{
			String j=sc.nextLine();
			a.add(j);
		}
		System.out.println("Hello World " +a);
	//	Scanner scan=new Scanner(System.in);
		System.out.println("Enter Second World ? ");
		int n=6;
		ArrayList arr=new ArrayList(n);
		for(int j=0;j<6;j++)
		{
			String ij=sc.nextLine();
			arr.add(ij);
		}
		System.out.println("Again Hello World " +arr);	
	}
}
/*
Enter the world
sab
sjf
dn
fnkf
nkf
fnk
Hello World [sab, sjf, dn, fnkf, nkf, fnk]
Enter Second World ? 
fdih
df
jif
h
fife
ej
Again Hello World [fdih, df, jif, h, fife, ej]
*/