package Set3;

import java.util.Scanner;
/*### **Problem 26: Print a Pattern of Alternating Characters in Rows**
**Difficulty:** Hard  
**Topics:** Pattern Printing  
**Hint:** Print a pattern where rows alternate between two characters.

**Example 1:**
**Input:** `n = 4`  
**Output:**
```
ABAB
BABA
ABAB
BABA
```
 */
public class Program26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        char [][]arr=new char[h][h];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i%2==0){
                    if(j%2==0){
                        arr[i][j]='A';
                    }else{
                        arr[i][j]='B';
                    }
                }else{
                    if(j%2==1){
                        arr[i][j]='A';
                    }else{
                        arr[i][j]='B';
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
