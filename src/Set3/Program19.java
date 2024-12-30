package Set3;

import java.util.Scanner;
/*
### **Problem 19: Print an Inverted Pyramid Pattern with Characters**
**Difficulty:** Medium  
**Topics:** Pattern Printing  
**Hint:** Print an inverted pyramid pattern using characters. Each row should have decreasing characters from the top row.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
CCC
 BB
  A
```
 */
public class Program19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        char arr[][]=new char[h][];
        for (int i = 0; i<arr.length; i++) {
            arr[i]=new char[arr.length-i];
        }
        char ch='C';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=ch;
            }
            ch--;
        }
        for (int i = 0; i < arr.length; i++) {
            int temp=i;
            while (temp>0) {
                System.out.print("  ");
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
