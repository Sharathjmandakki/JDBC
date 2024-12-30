package Set3;

import java.util.Scanner;

/*---

### **Problem 32: Print a Star Pattern with Increasing and Decreasing Width**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a pattern with stars that increase to a midpoint and then decrease. The stars should be centered horizontally.

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
public class Program32 {
     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        String arr[][]=new String[h*2-1][];
        int c=1,n=1;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new String[c];
            if(n>=h){
                c-=2;
            }else{
                c+=2;
            }
            n++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]="*";
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int temp=Math.abs(h-i-1);
            while (temp>0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }
}