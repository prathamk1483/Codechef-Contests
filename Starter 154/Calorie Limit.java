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
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int arr[] = new int[n];
		    
		    for(int i=0;i<n;i++) arr[i] = sc.nextInt();
		    int count = 0;
		    for(int i=0;i<n;i++){
		        if(k - arr[i] >= 0){
		            k-=arr[i];
		            count++;
		        }
		        else break;
		    }
		    System.out.println(count);
		}
	}
}
