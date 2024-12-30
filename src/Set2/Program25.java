package Set2;

import java.util.Scanner;

/***Generating a Matrix with Alternating 0s and 1s**  
    **Difficulty**: Easy  
    **Topics**: Arrays, Matrix Operations  
    **Description**: Write a program to generate a matrix where the elements alternate between 0 and 1.  
    **Example**:  
    Input: `size = 3`  
    Output:  
    ```
    0 1 0  
    1 0 1  
    0 1 0  
    ```
 */
public class Program25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rc=sc.nextInt();
        int arr[][]=new int[rc][rc];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (count%2==0) {
                    arr[i][j]=0;
                }else{
                    arr[i][j]=1;
                }
                count++;
            }
        }

        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
