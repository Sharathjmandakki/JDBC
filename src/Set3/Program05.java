package Set3;

import java.util.Scanner;

/*
### **Problem 5: Print a Hollow Square of Stars**
**Difficulty:** Easy  
**Topics:** Pattern Printing  
**Hint:** Print a hollow square pattern with stars (`*`). The border of the square should be filled with stars while the inner part should be empty.

**Example 1:**
**Input:** `n = 5`  
**Output:**
```
*****
*   *
*   *
*   *
*****
```
 */
public class Program05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        String arr[][]=new String[h][h];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==0||j==0||i==arr.length-1||j==arr.length-1){
                    arr[i][j]="*";
                }else{
                    arr[i][j]=" ";
                }
            }
        }
        for (String[] strings : arr) {
            for (String s2 : strings) {
                System.out.print(s2);
            }
            System.err.println();
        }
        sc.close();
    }
}
