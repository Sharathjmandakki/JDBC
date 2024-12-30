package Set3;

import java.util.Scanner;

/*
### **Problem 6: Print a Number Triangle**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a right-angle triangle pattern with numbers. Each row should contain an increasing sequence of numbers starting from 1.

**Example 1:**
**Input:** `n = 4`  
**Output:**
```
1
12
123
1234
```
 */
public class Program06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int arr[][]=new int[h][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=j+1;
            }
        }
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }
        sc.close();
    }
}
