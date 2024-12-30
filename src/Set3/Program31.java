package Set3;

import java.util.Scanner;

/*
### **Problem 31: Print a Triangular Matrix with Numbers**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a triangular matrix where each row contains increasing numbers. Each subsequent row should start from the next number.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
1
2 3
4 5 6
```
 */
public class Program31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int num=1;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
