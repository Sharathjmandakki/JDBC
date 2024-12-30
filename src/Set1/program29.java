package Set1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * 29. **Finding the Largest Palindrome in a String**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, String Manipulation  
    **Description**: Write a program to find the largest palindrome in a given string.  
    **Example**:  
    Input: `string = "babad"`  
    Output: `"bab"` or `"aba"`  
    Explanation: Both "bab" and "aba" are valid palindromes in the string.
 * 
 */
public class program29 {
    public static ArrayList<String> substr=new ArrayList<String>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,res; 
        str=sc.next();
        for(int i=0;i<str.length();i++){
            res="";
            for (int j = i; j < str.length(); j++) {
                res+=str.charAt(j);
                substr.add(res);
            }
        }
        System.out.println("Sub String of string are => "+substr);
        for (String string : substr) {
            isPalindrom(string);
        }
        sc.close();
    }
    public static void isPalindrom(String str){
        String rev="";
        for (int i = str.length()-1; i>=0; i--) {
            rev+=str.charAt(i);
        }
        System.out.print((str.equalsIgnoreCase(rev))?(str+" ,"):"");
    }
}
