package Set3;

import java.util.Scanner;

/* ---

### **Problem 10: Print a Pyramid Pattern with Numbers**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a pyramid pattern with increasing numbers. Each row should have an increasing sequence of numbers, centered horizontally.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
  1
 232
34543
```

---
*/
public class Program10 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int arr[][]=new int[h][];
    int n=1;
    for (int i = 0; i < arr.length; i++) {
      arr[i]=new int[n];
      n+=2;
    }
   int temp=0;
    for (int i = 0; i < arr.length; i++) {
      temp=i;
      for (int j = 0; j < arr[i].length; j++) {
         if(j<=i){
            temp++;
            arr[i][j]=temp;
         }else{
            temp--;
            arr[i][j]=temp;
         }
      }
    }
    for (int i = 0; i < arr.length; i++) {
      int k=h-i-1;
      while (k>0) {
         System.out.print("  ");
         k--;
      }
      for (int j = 0; j < arr[i].length; j++) {
         System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    sc.close();
   } 
}
