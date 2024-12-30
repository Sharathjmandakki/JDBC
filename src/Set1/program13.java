package Set1;

import java.util.Scanner;

/*
 * *Reversing a String**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, String Manipulation  
    **Description**: Write a program to reverse a given string.  
    **Example**:  
    Input: `string = "programming"`  
    Output: `"gnimmargorp"`  
    Explanation: The reversed string of "programming" is "gnimmargorp".
 * 
 */
public class program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String res="";
        for (int i = 0; i < str.length(); i++) {
            res+=str.charAt(str.length()-1-i);
        }
        System.out.println(res);
        sc.close();
    }
}
