package Set1;

import java.util.Scanner;

/*
 * **Summing Digits of a Number**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Mathematical Computations  
   **Description**: Write a program to calculate the sum of digits of a number.  
   **Example**:  
   Input: `number = 1234`  
   Output: `10`  
   Explanation: The sum of the digits 1 + 2 + 3 + 4 = 10.  
 */
public class program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sumOfDigits(sc.nextInt());
        sc.close();
    }
    public static void sumOfDigits(int num) {
        int result = 0, temp = num;
        while (temp > 0) {
            result+=temp%10;
            temp /= 10;
        }
        System.out.println(result);
      }
    }
