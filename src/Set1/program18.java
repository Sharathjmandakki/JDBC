package Set1;

import java.util.Scanner;

/*
 * **Generating Multiplication Tables**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to generate multiplication tables for a given number.  
    **Example**:  
    Input: `number = 4`  
    Output:  
    ```
    4 x 1 = 4  
    4 x 2 = 8  
    4 x 3 = 12  
    4 x 4 = 16  
    4 x 5 = 20  
    ```  
    Explanation: The multiplication table for 4 up to 5 is generated. 
 */
public class program18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=5;i++){
            System.out.printf("%d X %d = %d",num,i,num*i);
            System.err.println();
        }
        sc.close();
    }
}
