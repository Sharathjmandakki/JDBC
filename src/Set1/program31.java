package Set1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * **Generating a Pascal’s Triangle**  
    **Difficulty**: Medium  
    **Topics**: Arrays, Mathematical Computations  
    **Description**: Write a program to generate Pascal's Triangle up to a given number of rows.  
    **Example**:  
    Input: `rows = 4`  
    Output:  
    ```
    1  
    1 1  
    1 2 1  
    1 3 3 1  
    ```  
    Explanation: Pascal's Triangle with 4 rows is generated.  

 */
public class program31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a = null;
        for (int row = 0; row <= rows; row++) {
            a = new ArrayList<Integer>();
            for (int i = 0; i <= row; i++) {
                if (row == i || i == 0||row==0) {
                    a.add(1);
                } else {
                    a.add(al.get(row - 1).get(i - 1) + al.get(row - 1).get(i));
                }
            }
            al.add(a);
        }
        for (ArrayList<Integer> ar : al) {
            System.out.println(ar);
        }
        sc.close();
    }
}
