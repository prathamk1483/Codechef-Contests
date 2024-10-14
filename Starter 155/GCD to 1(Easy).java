import java.util.Scanner;

class GCDMatrix {
    private static int[][] generatePrimeMatrix(int N, int M) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
                        31, 37, 41, 43, 47, 53, 59, 
                        61, 67, 71, 73, 79, 83, 89, 97};

        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = primes[(i + j) % primes.length];
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();

            int[][] matrix = generatePrimeMatrix(N, M);

            for (int[] row : matrix) {
                for (int j = 0; j < M; j++) {
                    System.out.print(row[j] + (j < M - 1 ? " " : ""));
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
