import java.util.Scanner;

class Codechef {
    private static void helper(Scanner sc) {
        long n = sc.nextLong();
        long x = sc.nextLong();
        long y = sc.nextLong();
        String s = sc.next();

        long aliceX = 0;
        long aliceY = 0;

        for (int i = 0; i < n; i++) {
            char move = s.charAt(i);
            switch (move) {
                case 'R':
                    aliceX++;
                    break;
                case 'L':
                    aliceX--;
                    break;
                case 'U':
                    aliceY++;
                    break;
                case 'D':
                    aliceY--;
                    break;
            }
        }
        long distance = Math.abs(aliceX - x) + Math.abs(aliceY - y);
        if (distance <= (n)){
            long remainingSeconds = n-distance;

            if (remainingSeconds % 2 == 0) {
                System.out.println("Yes");
                return;
            } else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("No");
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            helper(sc);
        }
    }
}
