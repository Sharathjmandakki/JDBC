package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/***Checking for a Balanced Bracket Sequence**  
    **Difficulty**: Medium  
    **Topics**: String Manipulation, Stack  
    **Description**: Write a program to check if a given string with brackets is balanced.  
    **Example**:  
    Input: `string = "{[()]}"`  
    Output: `True`  
    Explanation: The brackets are balanced.
 */
public class Program14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Character> al=new ArrayList<Character>();
        String str=sc.next();
        sc.close();
        if (str.length()%2==1) {
            System.out.println(false);
        }else{
            int index=0;
            for (int i = 0; i <str.length()/2; i++) {
                al.add(str.charAt(i));
                index=i;
            }
            // if(al.size()!=1){
                index++;
            // }
            System.out.println(al);
            for (int i = al.size()-1; i>=0; i--) {
                char ch=str.charAt(index);
                if(ch=='['){
                    ch=']';
                }else if(ch==']'){
                    ch='[';
                }else if(ch==')'){
                    ch='(';
                }else if(ch=='('){
                    ch=')';
                }else if(ch=='{'){
                    ch='}';
                }else if(ch=='}'){
                    ch='{';
                }
                if(al.get(i)!=ch){
                    System.out.println(false);
                    return;
                }
                index++;
            }
            System.out.println(true);
        }
        sc.close();
    }
}
