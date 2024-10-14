import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static void helper(Scanner sc){
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        if (n <= 3) {
            System.out.println(0);
            return;
        }
        
        int c1 = arr[n-3] - arr[0];
        int c2 = arr[n-1] - arr[2];
        int c3 = arr[n-2] - arr[1];
        
        int result = Math.min(c1, Math.min(c2, c3));
        
        System.out.println(result);
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
