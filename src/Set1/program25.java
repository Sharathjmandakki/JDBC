package Set1;

import java.util.Scanner;

/*
 * **Finding the Number of Digits in a Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to count the number of digits in a given number.  
    **Example**:  
    Input: `number = 12345`  
    Output: `5`  
    Explanation: The number 12345 has 5 digits.  
 */
public class program25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,digit=0;
        num=sc.nextInt();
        sc.close();
        System.out.println((""+num).length());
        while (num>0) {
            num/=10;
            digit++;
        }
        System.err.println(digit);
    }
}
