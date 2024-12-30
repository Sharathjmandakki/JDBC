package Set2;

import java.util.Scanner;

/*
 * **Calculating the Sum of a Series (1 + 1/2 + 1/3 + ... + 1/n)**  
   **Difficulty**: Medium  
   **Topics**: Mathematical Computations  
   **Description**: Write a program to calculate the sum of the series 1 + 1/2 + 1/3 + ... + 1/n up to the nth term.  
   **Example**:  
   Input: `n = 4`  
   Output: `2.083333`  
   Explanation: Sum of the series is 1 + 1/2 + 1/3 + 1/4 ≈ 2.083333.

 */
public class Program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        double dno=sc.nextInt();
        while (dno>0) {
            sum=sum+1/dno;
            dno--;
        }
        System.out.println(sum);
        sc.close();
    }
}
