import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            long sum =0;
            int temp = 1;
            if(n == x){
                while(x >0){
                    sum += Math.pow(2,x);
                    x--;
                }
            }
            else if(n  >x){
                for(int i=1;i<=n-x;i++){
                    sum -=Math.pow(2,i);
                }
                for(int i=n-x+1;i<=n;i++){
                    sum+= Math.pow(2,i);
                }
            }
            System.out.println((int)sum);
        }
	}
}
