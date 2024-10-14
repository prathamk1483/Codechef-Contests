import java.util.*;

class Codechef {
    private static long getAns(long[] arr ,long totalWalls){
        long prefixSum = 0;
        long ways = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                long suffixSum = totalWalls - prefixSum;
                if (prefixSum == suffixSum) ways += 2;
                else if (Math.abs(prefixSum - suffixSum) == 1) ways += 1;
            } 
            else  prefixSum += arr[i];
        }
        return ways;
    }
    private static void calculateWays(long[] arr) {
        int n = arr.length;
        long totalWalls = 0;
        for (long height : arr) if (height > 0)totalWalls += height;
        System.out.println(getAns(arr,totalWalls));
        return;
    }

    private static void helper(Scanner sc) {
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++)arr[i] = sc.nextLong();
        calculateWays(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            helper(sc);
        }
        sc.close();
    }
}
