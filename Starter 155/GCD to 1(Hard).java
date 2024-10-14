import java.util.Scanner;

class GCDMatrixHard {
    private static int[][] generatePrimeMatrix(int N, int M) {
        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = 2;
            }
        }

        for (int i = 0; i < Math.min(N, M); i++) {
            matrix[i][i] = 3;
        }

        if (N > M) {
            for (int i = M; i < N; i++) {
                matrix[i][0] = 3; 
            }
        } else if (N < M) {
            for (int j = N; j < M; j++) {
                matrix[0][j] = 3; 
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
