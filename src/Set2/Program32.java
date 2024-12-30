package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/*32. **Checking for a Repeated Substring in a String**  
    **Difficulty**: Medium  
    **Topics**: String Manipulation  
    **Description**: Write a program to check if a substring is repeated within a given string.  
    **Example**:  
    Input: `string = "abab"`  
    Output: `True`  
    Explanation: The substring "ab" is repeated.
 */
public class Program32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        sc.close();
        ArrayList<String> al=new ArrayList<String>();
        for (int i = 0; i < str.length(); i++) {
            String temp="";
            for (int j = i; j < str.length(); j++) {
                temp+=str.charAt(j);
                al.add(temp);
            }
        }
        for (int i = 0; i < al.size()-1; i++) {
            for (int j = i+1; j < al.size(); j++) {
                if(al.get(i).equals(al.get(j))){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
}
