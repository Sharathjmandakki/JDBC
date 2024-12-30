package Set2;

import java.util.Scanner;

/*50. **Generating a Triangle Pattern of Stars with a Given Height**  
    **Difficulty**: Easy  
    **Topics**: Patterns  
    **Description**: Write a program to create a triangle pattern of stars with a specified height.  
    **Example**:  
    Input: `height = 4`  
    Output:  
    ```
    *  
    **  
    ***  
    ****  
    ``` */
public class Program50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        String arr[][]=new String[h][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new String[i+1];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]="*";
            }
        }
        for (String[] strings : arr) {
            for (String strings2 : strings) {
                System.out.print(strings2+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
