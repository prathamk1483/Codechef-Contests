import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static void helper(Scanner sc){
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        
        int forred = g+b;
        int forblue = r+g;
        int forgreen = r+b;
        
        if(forred >= r && forblue >= b && forgreen >= g){
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
        return;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    helper(sc);
		}
	}
}
