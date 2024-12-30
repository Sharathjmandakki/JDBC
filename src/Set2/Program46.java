package Set2;

import java.util.Scanner;

/* 46. **Finding the Length of the Longest Word in a String**  
    **Difficulty**: Easy  
    **Topics**: String Manipulation  
    **Description**: Write a program to find the length of the longest word in a given string.  
    **Example**:  
    Input: `string = "Find the longest word"`  
    Output: `8`  
    Explanation: The longest word is "longest" with length 8.
*/
public class Program46 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String arr[]=str.split(" ");
        int max=0;
        for (String s : arr) {
            int temp=s.length();
            if(temp>max){
                max=temp;
            }
        }
        System.out.println(max);
    }
}
