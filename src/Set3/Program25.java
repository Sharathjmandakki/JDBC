package Set3;

import java.util.Scanner;

/* ### **Problem 25: Print a Matrix with Zigzag Pattern**
**Difficulty:** Hard  
**Topics:** Matrix Pattern  
**Hint:** Print a matrix with a zigzag pattern of numbers. The numbers should alternate direction row-wise.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
1 2 3 4
8 7 6 5
9 10 11 12
```
*/
public class Program25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int arr[][]=new int[h][1+h];
        int num=1;
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=num;
                num++;
                }
            }else{
                for (int j = arr[i].length-1; j>=0; j--) {
                    arr[i][j]=num;
                    num++;
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
