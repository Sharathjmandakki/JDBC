package Set2;

import java.util.Scanner;

/***Finding the Sum of the First N Odd Numbers**  
   **Difficulty**: Easy  
   **Topics**: Mathematical Computations  
   **Description**: Write a program to calculate the sum of the first N odd numbers.  
   **Example**:  
   Input: `N = 5`  
   Output: `25`  
   Explanation: Sum of the first 5 odd numbers (1 + 3 + 5 + 7 + 9) is 25.
 */
public class Program9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         int sum=0;
         for (int i = 1; i <= num*2; i++) {
            if(i%2==1){
                sum+=i;
            }
         }
         System.out.println(sum);
         sc.close();
    }
}
