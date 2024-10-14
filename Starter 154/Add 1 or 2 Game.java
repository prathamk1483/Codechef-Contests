import java.util.Scanner;

class Add1or2Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n== 1) {
                System.out.println("ALICE");
            } else {
                System.out.println("BOB");
            }
        }
        sc.close();
    }
}
