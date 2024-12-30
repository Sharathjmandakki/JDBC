package Set1;

import java.util.Scanner;

/*
 * **Calculating the Sum of Odd Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to find the sum of all odd numbers within a given range.  
    **Example**:  
    Input: `range = [1, 10]`  
    Output: `25`  
    Explanation: The sum of odd numbers between 1 and 10 is 1 + 3 + 5 + 7 + 9 = 25.  
 */
public class program22 {
    public static void main(String[] args) {
        int sum=0,num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        for (int i = num1; i <=num2; i++) {
            if(i%2==1){
                sum+=i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
