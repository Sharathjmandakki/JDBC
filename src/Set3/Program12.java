package Set3;

import java.util.Scanner;

/*
### **Problem 12: Print a Pascal’s Triangle**
**Difficulty:** Medium  
**Topics:** Matrix Pattern  
**Hint:** Print Pascal’s Triangle up to `N` rows. Each row should be constructed based on the sum of the elements directly above it in the previous row.

**Example 1:**
**Input:** `n = 4`  
**Output:**
```
   1
  1 1
 1 2 1
1 3 3 1
```
 */
public class Program12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int arr[][]=new int[h][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i==0||j==0||j==arr[i].length-1){
                    arr[i][j]=1;
                }else{
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int temp=h-i;
            while (temp>0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
