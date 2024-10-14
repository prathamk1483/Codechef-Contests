import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int m = sc.nextInt();
		    
		    int d1 = Math.abs(b-a);
		    int d2 = Math.abs(c-a);
		    int d3 = Math.abs(c-b);
		    
		    if(d1 <= m || d2 <= m || d3 <= m ) System.out.println("YES");
		    else System.out.println("NO");
		}
	}
}
