package Set3;

import java.util.Scanner;

/*
### **Problem 46: Print a Star Pattern with Diamond Shape and Numbers**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a pattern with a diamond shape of stars, with numbers inside the diamond.

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
public class Program46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 0; i < h * 2; i++) {
            if (i % 2 == 0) {
                int num = 1;
                int temp = Math.abs((i-1) - h);
                while (temp > 0) {
                    System.out.print(" ");
                    temp--;
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(num + " ");
                    if (j < i / 2) {
                        num++;
                    } else {
                        num--;
                    }
                }
                System.out.println();
            }
        }
        sc.close();
        for (int i = h * 2 - 3; i >= 0; i--) {
            if (i % 2 == 0) {
                int temp = Math.abs((i-1) - h);
                while (temp > 0) {
                    System.out.print(" ");
                    temp--;
                }
                int num=1;
                for (int j = i; j >= 0; j--) {
                    System.out.print(num+" ");
                    if(j<=i/2){
                        num--;
                    }else{
                        num++;
                    }
                }
                System.out.println();
            }
        }
    }
}
