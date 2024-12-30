package Set3;

import java.util.Scanner;

/*
### **Problem 45: Print a Pattern with Rows of Increasing Characters**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a pattern where each row contains an increasing sequence of characters.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
A
BC
DEF
```
 */
public class Program45 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        char ch='A';
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}
