import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef{
    private static void helper(FastReader sc, PrintWriter out) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        
        int ans =0;
        for(int i=x;i>=0;i--){
            if(i*y > z)ans++;
            else break;
        }
        out.print(ans+"\n");
        out.flush();
    }
    public static void main(String[] args) 
    { 
        FastReader sc = new FastReader(); 
        PrintWriter out=new PrintWriter(System.out);
        int t = sc.nextInt();

        while(t-->0){
            helper(sc,out);
        }
    } 


    static void reverseArray(int arr[]){
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        return;
    }
    static class FastReader { BufferedReader br; StringTokenizer st; public FastReader() { br = new BufferedReader( new InputStreamReader(System.in)); } String next() { while (st == null || !st.hasMoreElements()) { try { st = new StringTokenizer(br.readLine()); } catch (IOException e) { e.printStackTrace(); } } return st.nextToken(); } int nextInt() { return Integer.parseInt(next()); } long nextLong() { return Long.parseLong(next()); } double nextDouble() { return Double.parseDouble(next()); } String nextLine() { String str = ""; try { if(st.hasMoreTokens()){ str = st.nextToken("\n"); } else{ str = br.readLine(); } } catch (IOException e) { e.printStackTrace(); } return str; } }
    static boolean isPowerOfTwo(int x){return (x != 0 && (x&(x-1)) == 0);}
}
