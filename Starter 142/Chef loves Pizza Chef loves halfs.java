import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static void helper(Scanner sc){
        int x = sc.nextInt();
        if(x != 0 && ((x & (x - 1)) == 0)){
            System.out.println(0);
            return;
        }
        else{
            for(int i=x;;i+=2){
                if(i != 0 && ((i & (i - 1)) == 0)){
                    System.out.println(2*x-i);
                    return;
                }
            }
        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- >0){
		    helper(sc);
		}
	}
}
