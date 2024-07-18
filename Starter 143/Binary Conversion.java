import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static void helper(Scanner sc){
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        
        long count =0,z=0,o=0,change=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i) != t.charAt(i)){
                count++;
                if(s.charAt(i) == '0') change+=0;
                else change+=1;
            }
            if(s.charAt(i) == '1') o++;
            else if(s.charAt(i) == '0') z++;
            if(t.charAt(i) == '1') o--;
            else if(t.charAt(i) == '0') z--;
        }
        
        if(z!= 0 || o != 0){
            System.out.println("NO");
            return;
        }
        if(s.equals(t) && k%2 == 1 && (s.equals("01") || s.equals("10"))){
            System.out.println("NO");
            return;
        }
        if(count == 2 && n == 2 && k%2 == 0)System.out.println("NO");
        else{ 
            if( (count/2) <= k && change <=k && change*2 == count){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
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
