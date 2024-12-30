package Set3;

import java.util.Scanner;

/*### **Problem 44: Print a Matrix with Increasing Rows and Columns**
**Difficulty:** Easy  
**Topics:** Matrix Pattern  
**Hint:** Print a matrix where each row and column contains increasing numbers.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
1 2 3
4 5 6
7 8 9
```
 */
public class Program44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int num=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(++num+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
