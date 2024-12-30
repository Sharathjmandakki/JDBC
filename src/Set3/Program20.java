package Set3;

import java.util.Scanner;

/*
### **Problem 20: Print a Cross Pattern with Stars**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a cross pattern using stars. The cross should be centered within a matrix.

**Example 1:**
**Input:** `n = 5`  
**Output:**
```
***
  *
  *
  *
***
```
 */
public class Program20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr[][]=new String[sc.nextInt()][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==0||i==arr.length-1){
                    arr[i][j]="*";
                }else{
                    if(j==arr[i].length-1){
                        arr[i][j]="*";
                    }else{
                        arr[i][j]=" ";
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
