package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * **Generating Pascal’s Triangle Up to N Rows**  
    **Difficulty**: Medium  
    **Topics**: Combinatorics  
    **Description**: Write a program to generate Pascal’s Triangle up to N rows.  
    **Example**:  
    Input: `N = 3`  
    Output:  
    ```
    1  
    1 1  
    1 2 1  
    ```

 */
public class Program22 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> a;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // a = new ArrayList<Integer>();
        for (int i = 0; i <= n; i++) {
            a = new ArrayList<Integer>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0 || j == i) {
                    a.add(1);
                    // al.add(a);
                } else {
                    a.add(al.get(i - 1).get(j - 1) + al.get(i - 1).get(j));
                }
            }
            al.add(a);
        }
        sc.close();
        System.out.println(al);
    }
}
