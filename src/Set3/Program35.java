package Set3;

import java.util.Scanner;

/*
### **Problem 35: Print a Matrix with Spiral Diagonals**
**Difficulty:** Hard  
**Topics:** Matrix Pattern  
**Hint:** Print a matrix with numbers arranged in diagonal spirals. The numbers should fill the matrix in a diagonal spiral fashion.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
1 2 3
4 5 6
7 8 9
```
 */
public class Program35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n=1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        sc.close();
    }
}
