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
            int m = sc.nextInt();
            int p = sc.nextInt();
            
            int ans = 0;
            for(int i = 0; i <= (300 - m - 1); i++) {
                int penaltyWithWrongSubmissions = p + 20 * i;
                int correctSubmissionTime = m + i;
                
                if (penaltyWithWrongSubmissions + correctSubmissionTime <= 1000) {
                    ans = i;
                } else {
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
