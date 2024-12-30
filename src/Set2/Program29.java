package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/*
29. **Finding All Divisors of the Product of Two Numbers**  
    **Difficulty**: Medium  
    **Topics**: Number Theory  
    **Description**: Write a program to find all divisors of the product of two given numbers.  
    **Example**:  
    Input: `number1 = 6`, `number2 = 10`  
    Output: `[1, 2, 3, 5, 6, 10, 15, 30]`  
    Explanation: The product of 6 and 10 is 60, and its divisors are listed.
 */
public class Program29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        int res=num1*num2;
        for (int i = 1; i < res; i++) {
            if(res%i==0){
                al.add(i);
            }
        }
        System.out.println(al);
        sc.close();
    }
}
