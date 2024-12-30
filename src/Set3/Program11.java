package Set3;

import java.util.Scanner;

/*
### **Problem 11: Print a Pattern of Alternating 0s and 1s**
**Difficulty:** Medium  
**Topics:** Matrix Pattern  
**Hint:** Print a matrix where elements alternate between `0` and `1`. The pattern should alternate both row-wise and column-wise.

**Example 1:**
**Input:** `n = 4`  
**Output:**
```
0101
1010
0101
1010
```
 */
public class Program11 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int rc=sc.nextInt();
    int arr[][]=new int[rc][rc];
    int ele=0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            if(i%2==1){
                if(j%2==0){
                    ele=0;
                }else{
                    ele=1;
                }
            }else{
                if(j%2==1){
                    ele=0;
                }else{
                    ele=1;
                }
            }
            arr[i][j]=ele;
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
