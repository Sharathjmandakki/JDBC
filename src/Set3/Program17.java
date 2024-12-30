package Set3;

import java.util.Scanner;

/*
### **Problem 17: Print a Pyramid Pattern of Increasing Stars**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a pyramid pattern where each row increases in the number of stars.

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
public class Program17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[][]=new String[n][];
        int num=1;
        for (int i = 0; i < n; i++) {
            arr[i]=new String[num];
            num+=2;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]="*";
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int temp=n-i-1;
            while (temp>0) {
                System.out.print("  ");
                temp--;
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
