import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static void helper(Scanner sc){
        int n = sc.nextInt();
        long arr[] = new long[n];
        Map<Long,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){ 
            arr[i] = sc.nextLong();
            m.put(arr[i],i);
        }
        Arrays.sort(arr);
        long max = 0;
        for(int i=0;i<n;i++){
            if( m.get(arr[i]) != i ){
                max = arr[i];
            }
        }
        System.out.println(max == 0 ? 0: max + arr[0]);
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
