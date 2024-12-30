package Set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/***Counting the Number of Palindromic Substrings in a String**  
   **Difficulty**: Medium  
   **Topics**: String Manipulation  
   **Description**: Write a program to count how many palindromic substrings exist in a given string.  
   **Example**:  
   Input: `string = "aaa"`  
   Output: `6`  
   Explanation: Palindromic substrings are "a", "a", "a", "aa", "aa", "aaa".
 */
public class Program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> al=new ArrayList<String>();
        ArrayList<String> pal=new ArrayList<String>();
        String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
            String temp="";
            for (int j = i; j < str.length(); j++) {
                temp+=str.charAt(j);
                al.add(temp);
            }
        }
        sc.close();
        Collections.sort(al);
        System.out.println("Sub string are "+al);
        for (String string : al) {
            if (isPalendrome(string)) {
                pal.add(string);
            }
        }
        System.out.println(pal);
    }
    public static boolean isPalendrome(String string) {
        String temp="";
        for (int i = string.length()-1; i >=0; i--) {
            temp+=string.charAt(i);
        }
        if(temp.equalsIgnoreCase(string)){
            return true;
        }
        return false;
    }
}
