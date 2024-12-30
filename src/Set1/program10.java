package Set1;

import java.util.Scanner;

/*
 * **Finding the Greatest Common Divisor (GCD)**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find the GCD of two numbers.  
    **Example**:  
    Input: `a = 48, b = 18`  
    Output: `6`  
    Explanation: The GCD of 48 and 18 is 6.

 */
public class program10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b =sc.nextInt();
        usingBrutForce(a,b);
        usingRecursion(a, b);
        sc.close();
    }
    public static void usingBrutForce(int a,int b) {
        int temp=0;
        while (b>0) {
            temp=a%b;
            a=b;
            b=temp;
        }
        System.out.println(a);
    }
    public static void usingRecursion(int a,int b) {
        if(b<=0){
            System.out.println(a);
        }else{
            usingRecursion(b, a%b);
        }
    }
}
