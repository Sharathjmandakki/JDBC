package Set1;

import java.util.Scanner;

/*
 * **Finding the Least Common Multiple (LCM)**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find the LCM of two numbers.  
    **Example**:  
    Input: `a = 12, b = 15`  
    Output: `60`  
    Explanation: The LCM of 12 and 15 is 60. 
 * 
 */
public class program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println((a*b)/gcd(a, b));
        sc.close();
    }
    public static int gcd(int a,int b){
        if(b<=0){
            return a;
        }else{
            return gcd(b, a%b);
        }
    }
}
