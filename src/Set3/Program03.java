package Set3;

import java.util.Scanner;

/*### **Problem 3: Print a Pyramid Pattern**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a pyramid pattern with stars (`*`). The pyramid should have a single peak and each row should have an increasing number of stars, centered horizontally.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
  *
 ***
*****
```
 */
public class Program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 0; i < h * 2; i++) {
            if (i % 2 == 1) {
                continue;
            } else {
                for (int j = h*2-1; j >=0; j--) {
                    if (j>i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
