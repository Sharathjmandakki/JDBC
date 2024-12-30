package Set2;

import java.util.Scanner;

/***Generating a Matrix with Multiplication Table**  
   **Difficulty**: Easy  
   **Topics**: Arrays, Matrix Operations  
   **Description**: Write a program to generate a matrix where each element at position (i, j) is the product of i and j.  
   **Example**:  
   Input: `size = 3`  
   Output:  
   ```
   1 2 3  
   2 4 6  
   3 6 9  
   ```
 */
public class Program7 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rc=sc.nextInt();
        int arr[][]=new int[rc][rc];
        int num=1;
        for (int i = 0; i < arr.length; i++) {
            int mul=1;
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=num*mul;
                mul++;
            }
            num++;
        }
        sc.close();
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.err.println();
        }
    }
}
