package Set2;

import java.util.Scanner;

/*28. **Generating a Right-Angle Triangle Pattern of Numbers**  
    **Difficulty**: Easy  
    **Topics**: Patterns  
    **Description**: Write a program to create a right-angle triangle pattern with numbers.  
    **Example**:  
    Input: `height = 4`  
    Output:  
    ```
    1  
    12  
    123  
    1234  
    ```
 */
public class Program28 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int height=sc.nextInt();
       sc.close();
       int arr[][]=new int[height][];
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
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
       } 
    }
}
