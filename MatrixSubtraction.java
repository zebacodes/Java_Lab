import java.util.Scanner;

public class MatrixSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int result[][] = new int[r][c];

        System.out.println("Enter first matrix elements:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix elements:");
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                b[i][j] = sc.nextInt();

        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Result Matrix after subtraction:");
        for(int i=0;i<r;i++) {
            for(int j=0;j<c;j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
