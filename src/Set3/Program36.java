package Set3;

import java.util.Scanner;
/*### **Problem 36: Print a Checkerboard Pattern with Increasing Size**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print a checkerboard pattern where the size of each square increases as you move along the matrix.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
XOX
OXO
XOX
```

--- */
public class Program36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        char [][]arr=new char[h][h];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i%2==0){
                    if(j%2==1){
                        arr[i][j]='0';
                    }else{
                        arr[i][j]='X';
                    }
                }else{
                    if(j%2==0){
                        arr[i][j]='0';
                    }else{
                        arr[i][j]='X';
                    }
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.err.println();
        }
        sc.close();
    }
}
