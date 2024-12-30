package Set3;

import java.util.Scanner;

/*### **Problem 1: Print a Right-Angle Triangle of Stars**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a right-angle triangle pattern of stars (`*`). Each row should contain an increasing number of stars, starting from 1 star in the first row.

**Example 1:**
**Input:** `n = 4`  
**Output:**
```
*
**
***
****
``` */
public class Program01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        String arr[][]=new String[h][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new String[i+1];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]="*";
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
