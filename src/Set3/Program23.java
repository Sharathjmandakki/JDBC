package Set3;

import java.util.Scanner;

/*
---

### **Problem 23: Print a Diamond Pattern with Numbers Increasing**
**Difficulty:** Hard  
**Topics:** Pattern Printing  
**Hint:** Print a diamond pattern where numbers increase. Each row should show a symmetrical pattern with numbers increasing towards the center.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
  1
 121
12321
 121
  1
```
 */
public class Program23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int arr[][]=new int[h*2-1][];
        int od=1,r=1;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[r];
            if(od>=h){
                r-=2;
            }else{
                r+=2;
            }
            od++;
        }

        for (int i = 0; i < arr.length; i++) {
            int res=1;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=res;
                if(j>=arr[i].length/2){
                    res--;
                }else{
                    res++;
                }
            }
        }



        for (int i = 0; i < arr.length; i++) {
            int temp=Math.abs(h-1-i);
            while (temp>0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.err.println();
        }
        sc.close();
    }
}
