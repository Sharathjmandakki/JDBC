package Set3;

import java.util.Scanner;

/*
### **Problem 7: Print an Inverted Triangle Pattern**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print an inverted triangle pattern with stars (`*`). Each row should contain decreasing numbers of stars from the top row.

**Example 1:**
**Input:** `n = 5`  
**Output:**
```
*****
 ****
  ***
   **
    *
```
 */
public class Program07 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int h=sc.nextInt();
       String arr[][]=new String[h][h];
       for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if (i>j) {
                // System.out.print(" ");
                arr[i][j]=" ";
            }else{
                // System.out.print("* ");
                arr[i][j]="*";
            }
        }
       }
       for (String[] strings : arr) {
        for (String s2 : strings) {
            System.out.print(s2);
        }
        System.err.println();
       }
       sc.close();
    }
}
