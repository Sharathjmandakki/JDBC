package Set2;

import java.util.Scanner;

/***Finding the Sum of the First N Even Numbers**  
    **Difficulty**: Easy  
    **Topics**: Mathematical Computations  
    **Description**: Write a program to calculate the sum of the first N even numbers.  
    **Example**:  
    Input: `N = 4`  
    Output: `20`  
    Explanation: The first 4 even numbers are 2, 4, 6, 8, and their sum is 20.
 */
public class Program36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.close();
        int num=1,sum=0;
        while (N>0) {
            if(num%2==0){
                sum+=num;
                N--;
            }
            num++;
        }
        System.out.println(sum);
    }
}
