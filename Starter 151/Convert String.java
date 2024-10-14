import java.util.Scanner;

class Codechef {
    private static int calculateTotalOnes(String S) {
        return countCharacterOccurrences(S, '1');
    }
    private static int findValidKCount(int length, String binaryString) {
        int totalZeros = calculateTotalZeros(binaryString);
        int totalOnes = calculateTotalOnes(binaryString);
        int validKCount = 0;
        for (int k = 1; k <= length; k++) if(isTransformable(k, totalZeros, totalOnes)) validKCount++;
        return validKCount;
    }
    private static boolean isTransformable(int k, int zeros, int ones) {
        return (k >= zeros && (k - zeros) % 2 == 0) || (k >= ones && (k - ones) % 2 == 0);
    }
    private static void handleTestCases(Scanner scanner) {
        int numberOfTests = scanner.nextInt();
        while (numberOfTests-- > 0){
            int length = scanner.nextInt();
            String binaryString = scanner.next();
            System.out.println(findValidKCount(length, binaryString));
        }
    }
    private static int calculateTotalZeros(String S) {
        return countCharacterOccurrences(S, '0');
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        handleTestCases(scanner);
        scanner.close();
    }
    private static int countCharacterOccurrences(String S, char character) {
        int count = 0;
        for (char c : S.toCharArray()) if(c==character)count++;
        return count;
    }
}
