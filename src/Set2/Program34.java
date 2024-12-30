package Set2;

import java.util.Scanner;

/*34. **Finding the Number of Words in a String**  
    **Difficulty**: Easy  
    **Topics**: String Manipulation  
    **Description**: Write a program to count the number of words in a given string.  
    **Example**:  
    Input: `string = "Hello world"`  
    Output: `2`  
    Explanation: There are 2 words in the string.
 */
public class Program34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        System.out.println(arr.length);
        sc.close();
    }
}
