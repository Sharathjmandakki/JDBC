package Set1;

import java.util.Scanner;

/***Finding the N-th Triangular Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to find the N-th triangular number.  
    **Example**:  
    Input: `N = 4`  
    Output: `10`  
    Explanation: The 4th triangular number is 10 (sum of the first 4 natural numbers). */
public class program36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num*(num+1)/2);
        sc.close();
    }
    
}
