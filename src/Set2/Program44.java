package Set2;

import java.util.*;

/* 44. **Finding the Frequency of Each Character in a String**  
    **Difficulty**: Easy  
    **Topics**: String Manipulation  
    **Description**: Write a program to count the frequency of each character in a given string.  
    **Example**:  
    Input: `string = "hello"`  
    Output: `{'h': 1, 'e': 1, 'l': 2, 'o': 1}`  
    Explanation: The frequency of each character in the string "hello" is shown.
*/
public class Program44 {
    public static void main(String[] args) {
        HashMap<Character,Integer> ts=new HashMap<Character,Integer>();
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
            if(ts.containsKey(str.charAt(i))){
                ts.put(str.charAt(i), ts.get(str.charAt(i))+1);
            }else{
                ts.put(str.charAt(i), 1);
            }
        }
        System.out.println(ts);
        sc.close();
    }
}
