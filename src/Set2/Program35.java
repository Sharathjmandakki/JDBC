package Set2;

import java.util.Scanner;

/*35. **Generating a Matrix with a Diagonal Pattern**  
    **Difficulty**: Medium  
    **Topics**: Matrix Operations  
    **Description**: Write a program to create a matrix where elements form diagonal lines of a given pattern.  
    **Example**:  
    Input: `size = 4`  
    Output:  
    ```
    1 0 0 0  
    1 1 0 0  
    1 1 1 0  
    1 1 1 1  
    ```
 */
public class Program35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rc=sc.nextInt();
        int arr[][]=new int[rc][rc];
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i>=j){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
