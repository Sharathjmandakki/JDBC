package Set3;

import java.util.Scanner;

/*
---

### **Problem 13: Print a Pattern of Consecutive Numbers**
**Difficulty:** Medium  
**Topics:** Matrix Pattern  
**Hint:** Print a matrix of consecutive numbers starting from 1, filling rows sequentially.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
1 2 3
4 5 6
7 8 9
```

---
 */
public class Program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int arr[][]=new int[h][h];
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=++num;
            }
        }
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
