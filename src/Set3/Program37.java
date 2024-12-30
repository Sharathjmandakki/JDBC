package Set3;

import java.util.Scanner;

/*
### **Problem 37: Print a Cross Pattern with Increasing Size**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a cross pattern where the size of the cross increases with each row. The pattern should be centered.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
  *
 ***
*****
 ***
  *
``` */
public class Program37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        for (int i = 0; i < h; i++) {
            int temp=Math.abs(i-h-1);
            while (temp>0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
        for (int i = h-2; i >=0; i--) {
            int temp=Math.abs(i-h-1);
            while (temp>0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
