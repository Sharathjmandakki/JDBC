package Set1;

import java.util.Scanner;

/*
 * **Finding the Factorial of a Number**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Mathematical Computations  
   **Description**: Write a program to compute the factorial of a given number.  
   **Example**:  
   Input: `number = 5`  
   Output: `120`  
   Explanation: 5! (factorial) is 5 × 4 × 3 × 2 × 1 = 120.  
 * 
 */
public class program8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        factorial(num);
        System.out.println(fact(num));
        sc.close();
    }

    public static void factorial(int num) {
        int res=1;
        for (int i = 1; i <= num; i++) {
            res*=i;
        }
        System.out.println(res);
    }

    public static int fact(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return fact(num - 1) * num;
        }
    }
}
