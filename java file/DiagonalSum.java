import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter 3x3 matrix elements:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

       
        int rightDiagonalSum = 0;
        for(int i=0; i<3; i++) {
            rightDiagonalSum += matrix[i][i];
        }
        System.out.println("Sum of the right diagonal = " + rightDiagonalSum);

    
        int leftDiagonalSum = 0;
        for(int i=0, j=2; i<3; i++, j--) {
            leftDiagonalSum += matrix[i][j];
        }
        System.out.println("Sum of the left diagonal = " + leftDiagonalSum);
    }
}