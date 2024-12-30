package Set2;

import java.util.Scanner;

/*
40. **Finding the Sum of the Squares of All Even Numbers Up to N**  
    **Difficulty**: Medium  
    **Topics**: Mathematical Computations  
    **Description**: Write a program to calculate the sum of squares of all even numbers up to a given N.  
    **Example**:  
    Input: `N = 4`  
    Output: `20`  
    Explanation: The even numbers up to 4 are 2 and 4, and their squares are 4 and 16. The sum is 20. */
public class Program40 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int sum=0;
    for (int i = 1; i <=num; i++) {
        if(i%2==0){
            sum+=(i*i);
        }
    }
    System.out.println(sum);
    sc.close();
  }  
}
