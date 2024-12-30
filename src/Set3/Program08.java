package Set3;

import java.util.Scanner;

/*---

### **Problem 8: Print a Diamond Pattern with Numbers**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a diamond pattern with numbers. The pattern should have a peak in the middle with symmetric rows above and below it.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
  1
 121
12321
 121
  1
```
 */
public class Program08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int arr[][] = new int[h * 2 - 1][];
    int col = 1, count = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = new int[col];
      if (count < h - 1) {
        col += 2;
        count++;
      } else {
        col -= 2;
      }
    }
    for (int i = 0; i < arr.length; i++) {
      int c = 0;
      for (int j = 0; j < arr[i].length; j++) {
        if (j <= arr[i].length / 2) {
          arr[i][j] = j + 1;
          c = j;
        } else {
          arr[i][j] = c;
          c--;
        }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      if (i <= arr.length / 2) {
        int k = h - i - 1;
        while (k > 0) {
          System.out.print(" ");
          k--;
        }
      } else {
        int l = 0;
        while (l < i-2) {
          System.out.print(" ");
          l++;
        }
      }
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]);
      }

      System.out.println();
    }
    sc.close();
  }
}
