import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();
            int zeroCount = 0;
            
            // Read the array and calculate frequencies
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    zeroCount++;
                } else {
                    freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
                }
            }
            
            // Calculate pairs from non-zero elements
            long pairs = 0;
            for (int count : freq.values()) {
                pairs += (long) count * (count - 1) / 2;
            }
            
            // Find the maximum frequency of any non-zero element
            int maxFreq = freq.values().stream().max(Integer::compare).orElse(0);
            
            // Add pairs formed by replacing zeros
            long maxPairs = pairs + (long) (maxFreq + zeroCount) * (maxFreq + zeroCount - 1) / 2 - pairs;
            
            System.out.println(maxPairs);
        }
        
        sc.close();
    }
}
