package Set2;

import java.util.Scanner;

/*
 * **Generating a Multiplication Table for a Range**  
   **Difficulty**: Easy  
   **Topics**: Arrays, Basic Programming  
   **Description**: Write a program to generate multiplication tables for numbers within a specified range.  
   **Example**:  
   Input: `start = 2`, `end = 4`  
   Output:  
   ```
   2 x 1 = 2   3 x 1 = 3   4 x 1 = 4  
   2 x 2 = 4   3 x 2 = 6   4 x 2 = 8  
   2 x 3 = 6   3 x 3 = 9   4 x 3 = 12  
   2 x 4 = 8   3 x 4 = 12  4 x 4 = 16  
   ```
 */
public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for (int i = start; i <= end; i++) {
            for (int j =1; j <= end; j++) {
                System.out.println(i+"X"+j+"="+(i*j));
            }
            System.out.println();
        }
        sc.close();
    }
}
