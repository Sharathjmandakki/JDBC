package Set1;

import java.util.Arrays;
import java.util.Scanner;

/**Checking for an Anagram**  
    **Difficulty**: Easy  
    **Topics**: String Manipulation  
    **Description**: Write a program to check if two strings are anagrams.  
    **Example**:  
    Input: `string1 = "listen"`, `string2 = "silent"`  
    Output: `True`  
    Explanation: "listen" and "silent" are anagrams of each other.
    **/ 
public class program34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        sc.nextLine();
        String s2=sc.next();
        char arr1[]=new char[s1.length()];
        char arr2[]=new char[s2.length()];
        if(s1.length()!=s2.length())
        {
            System.err.println("False");
        }else{
            for (int i = 0; i < s1.length(); i++) {
                arr1[i]=s1.charAt(i);
            }for (int i = 0; i < s2.length(); i++) {
                arr2[i]=s2.charAt(i);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            s1=new String(arr1);
            s2=new String(arr2);
            if(s1.equals(s2))
            {
                System.out.println("True");
            }else
            {
                System.err.println("False");
            }
            sc.close();
        }

    }
}
