package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/***
 * Checking for Palindromic Numbers in a Range**
 ** Difficulty**: Medium
 ** Topics**: Mathematical Computations
 ** Description**: Write a program to check for palindromic numbers within a
 * given range.
 ** Example**:
 * Input: `start = 1`, `end = 100`
 * Output: `[1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99]`
 * Explanation: Palindromic numbers between 1 and 100 are the numbers listed.
 */
public class Program24 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            if (numIsPalindrom(i)) {
                al.add(i);
            }
        }
        System.out.println(al);
        sc.close();
    }

    public static boolean numIsPalindrom(int num) {
        int temp = 0, num1 = num;
        while (num1 > 0) {
            temp *= 10;
            temp += num1 % 10;
            num1 /= 10;

        }
        if (num == temp) {
            return true;
        }
        return false;
    }
}
