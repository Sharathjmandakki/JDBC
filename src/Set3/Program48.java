package Set3;

import java.util.Scanner;

/*
### **Problem 48: Print a Pattern with Concentric Squares**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a pattern with concentric squares using stars. The outer square should be larger and each subsequent square should be centered inside.

**Example 1:**
**Input:** `n = 5`  
**Output:**
```
*****
*   *
*   *
*   *
*****
```
 */
public class Program48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        sc.close();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if (i == 0 || i == h - 1||j==0||j==h-1) {
                    
                    System.out.print( "* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
