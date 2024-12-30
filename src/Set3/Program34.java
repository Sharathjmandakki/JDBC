package Set3;

import java.util.Scanner;

/*
### **Problem 34: Print a Pattern with Increasing Characters in Columns**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a pattern where each column contains increasing characters from `A`.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
A
B C
D E F
```
 */
public class Program34 {
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
