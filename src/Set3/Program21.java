package Set3;

import java.util.Scanner;

/*
---

### **Problem 21: Print a Spiral Matrix**
**Difficulty:** Hard  
**Topics:** Matrix Pattern  
**Hint:** Print a matrix filled with numbers in a spiral pattern. The numbers should start from 1 and increment as you move around the spiral.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
1 2 3
8 9 4
7 6 5
```

---
 */
public class Program21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        int ele=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=ele;
                ele++;
            }
        }
        int temp=arr[1][1];
        arr[1][1]=arr[2][2];
        arr[2][2]=temp;
        temp=arr[1][2];
        arr[1][2]=arr[2][1];
        arr[2][1]=temp;
        temp=arr[1][0];
        arr[1][0]=arr[1][2];
        arr[1][2]=temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
