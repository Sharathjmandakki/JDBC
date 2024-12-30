package Set3;

import java.util.Scanner;

/*
### **Problem 39: Print a Matrix with Diamond Pattern of Numbers**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a matrix where numbers form a diamond pattern. The numbers should increase and decrease symmetrically around the center.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
  1
 121
12321
 121
  1
``` */
public class Program39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 0; i < h * 2; i++) {
            if (i % 2 == 1) {
                int num = 1;
                int temp = Math.abs(i - h*2);
                while (temp > 0) {
                    System.out.print(" ");
                    temp--;
                }
                for (int j = 0; j < i; j++) {
                    System.out.print(num + " ");
                    if (j < i / 2) {
                        num++;
                    } else {
                        num--;
                    }
                }
                System.out.println();
            }
        }
        sc.close();
        for (int i = h * 2 - 2; i >= 0; i--) {
            if (i % 2 == 1) {
                int temp = Math.abs(i - h*2);
                int num = 1;
                while (temp > 0) {
                    System.out.print(" ");
                    temp--;
                }
                for (int j = 0; j <i; j++) {
                    System.out.print(num + " ");
                    if (j > i / 2-1) {
                        num--;
                    } else {
                        num++;
                    }
                }
                System.out.println();
            }
        }
    }
}
