package Set3;

import java.util.Scanner;

/*
### **Problem 2: Print a Square of Stars**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a square pattern of stars (`*`). Each row and column should have the same number of stars.

**Example 1:**
**Input:** `n = 5`  
**Output:**
```
*****
*****
*****
*****
*****
```

--- */
public class Program02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        String arr[][]=new String[h][h];
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
