package Set1;

import java.util.Scanner;

/*
 * **Calculating the Sum of Digits of a Number Until Single Digit**  
    **Difficulty**: Medium  
    **Topics**: Mathematical Computations  
    **Description**: Write a program to keep summing the digits of a number until a single digit is obtained.  
    **Example**:  
    Input: `number = 9875`  
    Output: `2`  
    Explanation: The sum of digits is 9 + 8 + 7 + 5 = 29, and then 2 + 9 = 11, and finally 1 + 1 = 2.  

 */
public class program40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        while(num>9){
            num=sumofAllDigits(num);
        }
        System.out.println(num);
    }
    public static int sumofAllDigits(int num) {
        int sum=0;
        while (num>0) {
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}
