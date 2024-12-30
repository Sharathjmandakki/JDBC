package Set3;

import java.util.Scanner;

/*
---

### **Problem 41: Print a Pattern with Spiral and Zigzag**
**Difficulty:** Hard  
**Topics:** Matrix Pattern  
**Hint:** Print a matrix with both spiral and zigzag patterns. The matrix should first fill in a spiral pattern and then in a zigzag fashion.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
1 2 3
6 5 4
7 8 9
```

---
 */
public class Program41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][]=new int[n][n];
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j]=++num;
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    arr[i][j]=++num;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();

    }
}
