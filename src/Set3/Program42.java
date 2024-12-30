package Set3;

import java.util.Scanner;

/*
### **Problem 42: Print a Pattern of Alternating Characters in Matrix**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a matrix where characters alternate in each cell to form a pattern.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
ABAB
BABA
ABAB
```
 */
public class Program42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        for (int i = 0; i < num; i++) {
            if(i%2==0){
                for (int j = 0; j < num; j++) {
                    if(j%2==0){
                        System.out.print("A");
                    }else{
                        System.out.print("B");
                    }
                }
            }else{
                for (int j = 0; j < num; j++) {
                    if(j%2==0){
                        System.out.print("B");
                    }else{
                        System.out.print("A");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
