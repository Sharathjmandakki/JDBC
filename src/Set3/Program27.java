package Set3;

import java.util.Scanner;

/*---

### **Problem 27: Print a Number Pyramid Pattern with Characters**
**Difficulty:** Hard  
**Topics:** Pattern Printing  
**Hint:** Print a pyramid pattern using increasing characters, where each row increases in width and character range.

**Example 1:**
**Input:** `n = 3`  
**Output:**
```
  A
 BCD
EFGHI
```
 */
public class Program27 {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    char arr[][]=new char[h][];
    int od=1;
    for (int i = 0; i < arr.length; i++) {
        arr[i]=new char[od];
        od+=2;
    }
    char ch='A';
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            arr[i][j]=ch;
            ch++;
        }
    }
    for (int i = 0; i < arr.length; i++) {
        int temp=Math.abs(h-i-1);
        while (temp>0) {
            System.out.print(" ");
            temp--;
        }
        for (int j = 0; j < arr[i].length; j++) {
            System.out.print(arr[i][j]);
        }
        System.out.println();
    }
    sc.close();
 }   
}
