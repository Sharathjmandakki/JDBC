package Set2;

import java.util.Scanner;

/***
 * Generating a Diamond Pattern of Stars**
 ** Difficulty**: Medium
 ** Topics**: Patterns, Basic Programming
 ** Description**: Write a program to create a diamond pattern with stars of a
 * given size.
 ** Example**:
 * Input: `size = 5`
 * Output:
 * ```
 * 
 *** 
 ***** 
 *** 
 * 
 * ```
 */
public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if(i%2==1){
                for (int j = i; j<=num; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j>0; j-- ){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                System.out.println();
            }
        }
        for (int i = num; i >= 1; i--) {
            if (i % 2 == 1) {
                for (int j = i; j <= num; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j > 0; j--) {
                    System.out.print("* ");
                }
                System.out.println();
            } else {
                System.out.println();
            }
        }
        sc.close();
    }
}
