package Set2;

import java.util.Random;
import java.util.Scanner;

/***Generating a Matrix with Random Numbers**  
    **Difficulty**: Easy  
    **Topics**: Random Number Generation, Matrix Operations  
    **Description**: Write a program to generate a matrix filled with random numbers.  
    **Example**:  
    Input: `rows = 2`, `columns = 3`  
    Output:  
    ```
    3 8 1  
    7 4 6  
    ```
 */
public class Program45 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("rows = ");
     int r=sc.nextInt();
     System.out.print("columns = ");
     int c=sc.nextInt();
     int arr[][]=new int[r][c];   
     for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            Random ran=new Random();
            arr[i][j]=ran.nextInt(10);;
        }
     }
     for (int[] is : arr) {
        for (int is2 : is) {
            System.out.print(is2+" ");
        }
        System.out.println();
        sc.close();
     }
    }
}
