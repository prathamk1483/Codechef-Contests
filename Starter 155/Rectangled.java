import java.util.Scanner;
import java.util.*;

class  Rectangled {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        while (T-- > 0) {
            int N = scanner.nextInt();
            System.out.println(maxRectangleArea(N));
        }
        
        scanner.close();
    }
    public static int maxRectangleArea(int N) {

        int maxArea = 0;
        for (int width = 1; width <= N / 2; width++) {
            int height = (N - 2 * width) / 2;
            if (height > 0) {
                int area = width * height;
                maxArea = Math.max(maxArea, area);
            }
        }
        
        return maxArea;
    }
}
