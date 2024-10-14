import java.util.*;
import java.io.*;

class ColorfulTreeEasyOptimized {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();
        
        int t = Integer.parseInt(reader.readLine()); // Number of test cases
        
        while (t-- > 0) {
            int n = Integer.parseInt(reader.readLine()); // Number of vertices in the tree
            
            int[] degree = new int[n + 1]; // Array to store the degree of each node (number of connections)
            for (int i = 0; i < n - 1; i++) {
                String[] edge = reader.readLine().split(" ");
                int u = Integer.parseInt(edge[0]);
                int v = Integer.parseInt(edge[1]);
                degree[u]++;
                degree[v]++;
            }
            
            long totalBeauty = 0;
            
            // Calculate the total beauty score
            for (int i = 1; i <= n; i++) {
                if (degree[i] == 1) {
                    // Leaf node
                    totalBeauty += 3;
                } else {
                    // Internal node
                    totalBeauty += 2;
                }
            }
            
            output.append(totalBeauty).append("\n");
        }
        
        System.out.print(output);
    }
}
