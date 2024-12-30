package Set2;

import java.util.Scanner;

/***Finding the Count of Digits Greater Than a Specific Value**  
    **Difficulty**: Easy  
    **Topics**: Mathematical Computations  
    **Description**: Write a program to count how many digits in a number are greater than a specific value.  
    **Example**:  
    Input: `number = 54321`, `value = 3`  
    Output: `2`  
    Explanation: The digits

 greater than 3 in 54321 are 5, 4, and 4, so the count is 2.
 */
public class Program37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number = ");
        int num=sc.nextInt();
        System.out.print(", value = ");
        int value=sc.nextInt();
        int count=0;
        sc.close();
        while (num>0) {
            if(num%10>value){
                count++;
            }
            num/=10;
        }
        System.out.println(count);

    }
}
