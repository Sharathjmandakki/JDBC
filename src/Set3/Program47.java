package Set3;

import java.util.Scanner;

/*---

### **Problem 47: Print a Matrix with Cross Pattern of Numbers**
**Difficulty:** Hard  
**Topics:** Matrix Pattern  
**Hint:** Print a matrix where the center forms a cross pattern with numbers.

**Example 1:**
**Input:** `n = 5`  
**Output:**
```
12321
01210
01210
01210
12321
```
 */
public class Program47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        sc.close();
        for (int i = 0; i < h; i++) {
            int num = 0;
            for (int j = 0; j < h; j++) {
                if (i == 0 || i == h - 1) {
                    if (j <= h / 2) {
                        num++;
                    } else {
                        num--;
                    }
                    System.out.print(num + " ");
                } else {
                    if (j == 0 || j == h - 1) {
                        System.out.print(0+" ");
                    }else{
                        if (j <= h / 2) {
                            num++;
                        } else {
                            num--;
                        }
                        System.out.print(num + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
