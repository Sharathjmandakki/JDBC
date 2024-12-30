
/*
 * 
28. **Finding the Sum of the Digits of the Factorial of a Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to find the sum of the digits of the factorial of a given number.  
    **Example**:  
    Input: `number = 4`  
    Output: `9`  
    Explanation: The factorial of 4 is 24, and the sum of the digits (2 + 4) is 6.  
 * 
 */

package Set1;

import java.util.Scanner;

public class program28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, fact = 1;
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
        sumOfDigits(fact);
        sc.close();
    }

    public static void sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }
}