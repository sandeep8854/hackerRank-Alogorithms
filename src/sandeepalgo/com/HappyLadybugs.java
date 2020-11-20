package sandeepalgo.com;
import java.util.*;
public class HappyLadybugs
{
	 public static void main(String[] args)
	 {
	        Scanner in = new Scanner(System.in);
	       System.out.println("Enter The test case ?");
	        int Q = in.nextInt();
	        for(int a0 = 0; a0 < Q; a0++)
	        {
	        	System.out.println("Enter how many word in the String");
	            int n = in.nextInt();
	            System.out.println("Enter The String ?");
	            String b = in.next();
	            System.out.println(isHappy(b) ? "YES" : "NO");
	        }
	    }
	    
	    public static boolean isHappy(String s)
	    {
	        if (hasUnique(s))
	        {
	            return false;
	        }
	        
	        if (alreadyHappy(s))
	        {
	            return true;
	        }
	        
	        if (hasSpace(s)) 
	        {
	            return true;
	        }
	        
	        return false;
	    }
	    
	    public static boolean hasUnique(String s)
	    {
	        int[] ascii = new int[26];
	        
	        for (int i=0;i<s.length();i++)
	        {
	            if (s.charAt(i) != '_')
	            {
	                ascii[(int)s.charAt(i)-65]++;
	            }
	        }
	        
	        for (int i=0;i<26;i++)
	        {
	            if (ascii[i] == 1)
	            {
	                return true;
	            }
	        }   
	        return false;
	    }
	    public static boolean alreadyHappy(String s)
	    {
	        for (int i=0;i<s.length()-1;i++)
	        {
	            if (i == 0 && s.charAt(i) != s.charAt(i+1)) 
	            {
	                return false;
	            }
	            else if (s.charAt(i) != s.charAt(i+1) && s.charAt(i) != s.charAt(i-1))
	            {
	                return false;
	            }
	        }
	        return true;
	    }
	    
	    public static boolean hasSpace(String s)
	    {
	        for (int i=0;i<s.length();i++)
	        {
	            if (s.charAt(i) == '_') 
	            {
	                return true;
	            }
	        }
	        return false;
	    }
	}
/*
 * Enter The test case ?
4
Enter how many word in the String
7
Enter The String ?
RBY_YBR
YES
Enter how many word in the String
6
Enter The String ?
X_Y__X
NO
Enter how many word in the String
2
Enter The String ?
__
YES
Enter how many word in the String
6
Enter The String ?
B_RRBR
YES
*/
