package Set3;

import java.util.Scanner;

/*### **Problem 9: Print a Right-Angle Triangle of Numbers**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a right-angle triangle pattern with increasing numbers. Each row should contain a continuous sequence of increasing numbers.

**Example 1:**
**Input:** `n = 4`  
**Output:**
```
1
23
456
78910
```
 */
public class Program09 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
    int arr[][]=new int[s][];
    for (int i = 0; i < arr.length; i++) {
        arr[i]=new int[i+1];
    }
    int num=0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            ++num;
            arr[i][j]=num;
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
