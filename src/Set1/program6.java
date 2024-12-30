package Set1;

import java.util.Scanner;

/*/
**Identifying Palindromes**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, String Manipulation  
   **Description**: Write a program to check if a string or number is a palindrome.  
   **Example**:  
   Input: `string = "radar"`  
   Output: `Palindrome`  
   Explanation: "radar" reads the same backward as forward.  
*/
public class program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        String res="";
        for (int i = string.length()-1; i>=0; i--) {
            res+=string.charAt(i);
        }
        if(res.equals(string)){
            System.out.println("Palindrome");
        }
        else if(res.equalsIgnoreCase(string)){
            System.out.println("Palindrome");
        }else{
            System.err.println("Not a Palindrome");
        }
        sc.close();
    }
}
