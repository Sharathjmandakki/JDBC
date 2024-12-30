package Set3;

import java.util.Scanner;

/*
### **Problem 14: Print a Star Pattern with Increasing Width**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a pattern where each row has an increasing width of stars.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
*
***
*****
```

---
 */
public class Program14 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    String arr[][]=new String[h][];
    int row=1;
    for (int i = 0; i < arr.length; i++) {
        arr[i]=new String[row];
        row+=2;
    }
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j]="*";
        }
    }
    for (String[] strings : arr) {
        for (String strings2 : strings) {
            System.out.print(strings2);
        }
        System.out.println();
    }
    sc.close();
   } 
}
