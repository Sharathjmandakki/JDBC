package Set3;

import java.util.Scanner;

/* 
### **Problem 4: Print a Diamond Pattern**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a diamond pattern with stars (`*`). The pattern should include a single peak in the middle with symmetric rows above and below it.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
  *
 ***
*****
 ***
  *
```
*/
public class Program04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        for (int i = 0; i < h*2; i++) {
            if(i%2==1){
                continue;
            }else{
                for (int j = h*2-1; j >=0; j--) {
                    if(j>i){
                        System.out.print(" ");
                    }else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
        for (int i = 2; i < h*2; i++) {
            if(i%2==0){
                continue;
            }else{
                for (int j = 0; j <h*2; j++) {
                    if(i>j){
                        System.out.print(" ");
                    }else{
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
