package sandeepalgo.com;
import java.util.*;
public class Triplet 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The length ?");
		int length=sc.nextInt();
		ArrayList a=new ArrayList(length);
		for(int i=0;i<length;i++)
		{
			int j=sc.nextInt();
			a.add(j);
		}
		System.out.println(a);
		
		int length1=sc.nextInt();
		ArrayList b=new ArrayList(length);
		for(int i=0;i<length;i++)
		{
			int j=sc.nextInt();
			b.add(j);
		}
		System.out.println(b);
		ArrayList<Integer> result = compareTriplets(a, b);	
		System.out.println(result);
	}

	private static ArrayList<Integer> compareTriplets(ArrayList a, ArrayList b)
	{
		int aliceTotalScore=0;
        int bobTotalScore=0;
        for(int i=0;i<3;i++)
        {
            int aliceScore=(int) a.get(i);
            int bobScore=(int) b.get(i);
            if(aliceScore!=bobScore)
            {
                int temp=aliceScore>bobScore?aliceTotalScore++:bobTotalScore++;
            }
        }
        ArrayList<Integer> result=new ArrayList<>();
        result.add(aliceTotalScore);
        result.add(bobTotalScore);
        return result;
	}
}
/*
Enter The length ?
3
5
6
7
[5, 6, 7]
3
3
6
10
[3, 6, 10]
[1, 1]
*/