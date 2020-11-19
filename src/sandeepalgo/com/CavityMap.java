package sandeepalgo.com;
import java.util.*;
public class CavityMap
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N  ?");
		int n=sc.nextInt();
		String grid[]=new String[n];
		for(int i=0;i<n;i++)
		{
			grid[i]=sc.nextLine();
		}
		String result[]=cavityMap(grid);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
		
	}
	private static String[] cavityMap(String[] grid) 
	{
		 for(int i=1;i<grid.length-1;i++){
	            for(int j=1;j<grid[i].length()-1;j++){
	                if(grid[i].charAt(j)>grid[i].charAt(j+1) && grid[i].charAt(j)>grid[i].charAt(j-1) &&
	                		grid[i].charAt(j)>grid[i+1].charAt(j) && grid[i].charAt(j)>grid[i-1].charAt(j))
	                {
	                    grid[i]=grid[i].substring(0,j)+"X"+ grid[i].substring(j+1);
	                }
	            }
	        }
	        return grid;
	}
}
