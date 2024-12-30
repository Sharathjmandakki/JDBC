package Set3;

import java.util.Scanner;

/*
### **Problem 40: Print a Star Pattern with Increasing Width and Centered**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a pattern where the width of stars increases, and the stars are centered horizontally.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
  *
 ***
*****
```
 */
public class Program40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 0; i < h * 2; i++) {
            if (i % 2 == 1) {
                int temp = Math.abs(i - h*2-1);
                while (temp > 0) {
                    System.out.print(" ");
                    temp--;
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
