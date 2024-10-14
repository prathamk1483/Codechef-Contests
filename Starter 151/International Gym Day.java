import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (y >= x) {
                System.out.println(0);
                continue;
            }
            
            int low = 0, high = y;
            int ans = -1;
            
            while (low <= high) {
                int mid = (low + high) / 2;
                double discounted = (100 - d * mid) * x / 100.0;
                double budget = y - mid;
                
                if (discounted <= budget) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            
            System.out.println(ans);
        }
        
        sc.close();
    }
}
