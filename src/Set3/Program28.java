package Set3;

import java.util.Scanner;

/*
### **Problem 28: Print a Pattern with Diagonal Lines**
**Difficulty:** Hard  
**Topics:** Pattern Printing  
**Hint:** Print a pattern with diagonal lines using characters. Each diagonal line should be aligned properly.

**Example 1:**
**Input:** `n = 4`  
**Output:**
```
A
B B
C   C
D     D
```
 */
public class Program28 {
    public static void main(String[] args) {
        char ch='A';
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < h; j++) {
                if(i==j||j==0){
                    System.out.print(ch+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            ch++;
        }
        sc.close();
    }
}
