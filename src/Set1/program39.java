package Set1;

import java.util.Scanner;

/***
 * Generating a Square Matrix of a Given Size**
 ** Difficulty**: Medium
 ** Topics**: Arrays, Matrix Operations
 ** Description**: Write a program to generate a square matrix of a given size
 * and fill it with sequential numbers.
 ** Example**:
 * Input: `size = 3`
 * Output:
 * ```
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * ```
 * Explanation: A 3x3 matrix is generated with sequential numbers.
 */
public class program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rc = sc.nextInt();
        sc.close();
        int num = 1;
        int arr[][] = new int[rc][rc];
        for (int i = 0; i < rc; i++) {
            for (int j = 0; j < rc; j++) {
                arr[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < rc; i++) {
            for (int j = 0; j < rc; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
