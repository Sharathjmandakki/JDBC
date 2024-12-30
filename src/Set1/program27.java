package Set1;

import java.util.Scanner;

/*
 * **Generating a Pattern of Numbers**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Patterns  
    **Description**: Write a program to generate number patterns (e.g., sequential numbers in a matrix).  
    **Example**:  
    Input: `rows = 3`  
    Output:  
    ```
    1  
    2 3  
    4 5 6  
    ```  
    Explanation: A number pattern with 3 rows is generated.
 * 
 */
public class program27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int arr[][] = new int[rows][];
        for (int i = 0; i < rows; i++) {
            arr[i] = new int[i + 1];
        }
        int num = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = num;
                num++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
