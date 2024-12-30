package Set2;

import java.util.Scanner;

/*1. **Finding the Sum of Digits of a Number Until Zero**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Mathematical Computations  
   **Description**: Write a program to repeatedly sum the digits of a number until the result is zero.  
   **Example**:  
   Input: `number = 123`  
   Output: `6`  
   Explanation: Sum of digits is 1 + 2 + 3 = 6; sum of digits of 6 is 6 (which is a single digit). */
public class Program1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while (num>0) {
            sum+=num%10;
            num/=10;           
        }
        System.out.println(sum);
        sc.close();
    }
}
