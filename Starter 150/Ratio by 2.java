import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if (x >= 2 * y || y >= 2 * x) {
                System.out.println(0);
                continue;
            }

            if (x == y) {
                System.out.println((x + 1) / 2);
            } else if (x > y) {
                System.out.println(Math.min(2 * y - x, y - x / 2));
            } else {
                System.out.println(Math.min(2 * y - x, x - y / 2));
            }
        }

        sc.close();
    }
}
