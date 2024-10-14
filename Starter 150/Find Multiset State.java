import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine()); // Number of test cases

        StringBuilder output = new StringBuilder();
        while (T-- > 0) {
            String[] nk = br.readLine().split(" ");
            int N = Integer.parseInt(nk[0]);
            int K = Integer.parseInt(nk[1]);
            String[] arrayStr = br.readLine().split(" ");
            
            // Initialize ArrayList and populate it
            ArrayList<Integer> list = new ArrayList<>(N);
            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(arrayStr[i]));
            }

            // Perform K operations
            for (int i = 0; i < K; i++) {
                // Get the minimum and maximum elements
                int min = list.remove(0); // first element (smallest)
                int max = list.remove(list.size() - 1); // last element (largest)

                // Calculate their sum
                int sum = min + max;

                // Insert the sum back into the correct position
                int pos = Collections.binarySearch(list, sum);
                if (pos < 0) {
                    pos = -pos - 1; // Convert to insertion point
                }
                list.add(pos, sum);
            }

            // Prepare output for this test case
            for (int num : list) {
                output.append(num).append(" ");
            }
            output.append("\n");
        }

        // Flush all outputs at once
        bw.write(output.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
