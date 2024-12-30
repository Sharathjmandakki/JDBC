package Set3;

import java.util.Scanner;

/*
---

### **Problem 49: Print a Pattern of Alternating Rows and Columns of Numbers**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a pattern with alternating rows and columns of numbers, where each row and column increases sequentially.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
123
456
789
```
 */
public class Program49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        sc.close();
        int num = 1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
