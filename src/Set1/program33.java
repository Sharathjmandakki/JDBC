package Set1;

import java.util.Scanner;

/*
 * **Calculating the Power of a Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to calculate the power of a number.  
    **Example**:  
    Input: `base = 2`, `exponent = 3`  
    Output: `8`  
    Explanation: 2 raised to the power of 3 is 8. 
 */
public class program33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of base");
        int base=sc.nextInt();
        System.out.println("enetr the value of exponent");
        int exponent=sc.nextInt();
        System.out.println(Math.pow(base, exponent));
        sc.close();
    }
}
