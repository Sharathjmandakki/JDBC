package Set1;

import java.util.Scanner;

/*
 * 46. **Determining the Length of a String Without Using Built-In Functions**  
    **Difficulty**: Medium  
    **Topics**: String Manipulation  
    **Description**: Write a program to determine the length of a string without using built-in functions.  
    **Example**:  
    Input: `string = "hello"`  
    Output: `5`  
    Explanation: The length of the string "hello" is determined without using built-in functions. 
 */
public class program46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String temp="";
        int count=0;
        while (!temp.equals(str)) {
            temp+=str.charAt(count);
            count++;
        }
        System.out.print(count);
        sc.close();
    }
}
