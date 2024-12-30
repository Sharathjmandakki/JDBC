package Set3;

import java.util.Scanner;

/*
### **Problem 33: Print a Pattern of Nested Squares**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a pattern with nested squares using stars. The outermost square should be filled with stars, and each subsequent square should be smaller and centered inside the previous one.

**Example 1:**
**Input:** `n = 5`  
**Output:**
```
*****
*   *
*   *
*   *
*****
``` */
public class Program33 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if(j==0||j==h-1||i==0||i==h-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
        sc.close();
    }
}
