package Set2;

import java.util.Scanner;

/*
41. **Generating a Pattern of Increasing Numbers**  
    **Difficulty**: Easy  
    **Topics**: Patterns  
    **Description**: Write a program to create a pattern where numbers increase with each row.  
    **Example**:  
    Input: `rows = 3`  
    Output:  
    ```
    1  
    12  
    123  
    ```
 */
public class Program41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int arr[][]=new int[r][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=j+1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
            sc.close();
        }
    }
}
