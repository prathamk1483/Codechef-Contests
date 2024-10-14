import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    private static int[] helper(Scanner sc) {
        long skill[] = new long[16];
        Map<Long, Integer> m = new HashMap<>();
        
        for (int i = 0; i < 16; i++) {
            skill[i] = sc.nextLong();
            m.put(skill[i], i);
        }
        
        Arrays.sort(skill);
        
        long ans[] = new long[16];
        
        ans[15] = 4; 
        for (int i = 14; i >= 7; i--) ans[i] = 3; 
        for (int i = 6; i >= 3; i--) ans[i] = 2;
        for (int i = 2; i >= 1; i--) ans[i] = 1; 
        ans[0] = 0; 
        
        int res[] = new int[16];
        for (int i = 0; i < 16; i++) {
            res[m.get(skill[i])] = (int)ans[i];
        }
        
        return res;
    }
    
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int[] result = helper(sc);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
