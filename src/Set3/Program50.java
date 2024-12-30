package Set3;

import java.util.Scanner;

/*
---

### **Problem 50: Print a Matrix with Zigzag Pattern of Stars**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a matrix where stars form a zigzag pattern, alternating rows in their positioning.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
* * *
 * *
* * *
``` */
public class Program50 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        for (int i = 0; i < h; i++) {
            if(i%2==0){
                for (int j = 0; j < h; j++) {
                    System.out.print("* ");
                }
            }else{
                System.out.print(" ");
                for (int j = 0; j < h-1; j++) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
