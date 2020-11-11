package space.harbour.java.hw2;

import java.util.Scanner;

public class Pascal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Pascal triangle: ");
        int n = sc.nextInt();

        int[][] triangle = new int[n][n];
        triangle[0][0] = 1;
        for (int i = 1; i < n; i++) {
            triangle[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        int offset;
        for (int i = 0; i < n; i++) {
            offset = n - 1 - i;
            for (int k = 0; k < offset; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }

}
