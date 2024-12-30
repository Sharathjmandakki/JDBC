package Set3;

import java.util.Scanner;

/*
### **Problem 18: Print a Border Pattern with Numbers**
**Difficulty:** Medium  
**Topics:** Matrix Pattern  
**Hint:** Print a border pattern using numbers. The border should be filled with numbers, and the inner part should be empty.

**Example 1:**
**Input:** `n = 4`  
**Output:**
```
1234
1  1
1  1
1234
```
 */
public class Program18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==0||i==arr.length-1){
                    arr[i][j]=j+1;
                }else{
                    if(j==0||j==arr.length-1){
                        arr[i][j]=1;
                    }else{
                        arr[i][j]=0;
                    }
                }
            }
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
