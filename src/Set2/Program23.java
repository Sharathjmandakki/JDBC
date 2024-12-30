package Set2;

import java.util.Scanner;

/***Finding the Sum of Digits of the Product of Two Numbers**  
    **Difficulty**: Easy  
    **Topics**: Mathematical Computations  
    **Description**: Write a program to find the sum of the digits of the product of two given numbers.  
    **Example**:  
    Input: `number1 = 12`, `number2 = 34`  
    Output: `9`  
    Explanation: The product of 12 and 34 is 408, and the sum of its digits is 4 + 0 + 8 = 12. */
public class Program23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int num=n1*n2,sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println(sum);
        sc.close();
    }
}
