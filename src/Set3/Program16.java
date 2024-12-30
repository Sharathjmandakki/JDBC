package Set3;

import java.util.Scanner;

/*### **Problem 16: Print a Checkerboard Pattern**
**Difficulty:** Medium  
**Topics:** Matrix Pattern  
**Hint:** Print a checkerboard pattern with two different characters alternating.

**Example 1:**
**Input:** `n = 4`  
**Output:**
```
XOXOXO
OXOXOX
XOXOXO
OXOXOX
```

---
 */
public class Program16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        char [][]arr=new char[h][h+2];
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
