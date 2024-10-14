import java.util.*;

class Codechef
{
    private static void helper(Scanner sc){
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int sum = 0;
        while (a != b) {
            if (a > b) {
                int eaten = (a + 1) / 2; 
                sum += eaten;
                a -= eaten;
            } else {
                int eaten = (b + 1) / 2; 
                sum += eaten;
                b -= eaten;
            }
        }
        System.out.println(sum);
    }

    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            helper(sc);
        }
    }
}
