package Set3;

import java.util.Scanner;

/*
---

### **Problem 30: Print a Cross Pattern of Stars with Diagonals**
**Difficulty:** Hard  
**Topics:** Pattern Printing  
**Hint:** Print a cross pattern using stars with intersecting diagonals.

**Example 1:**
**Input:** `n = 5`  
**Output:**
```
* * * * *
 * * * *
  * * *
   * *
    *
   * *
  * * *
 * * * *
* * * * *
```
 */
public class Program30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        for (int i = h-1; i >=0; i--) {
            int temp=Math.abs(h-i-1);
            while (temp>0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = i; j>=0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <=h; i++) {
            int temp=Math.abs(h-i);
            while (temp>0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = 0; j <i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
