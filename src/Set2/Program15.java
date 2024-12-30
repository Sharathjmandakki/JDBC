package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/* **Finding the Sum of Numbers in a String**  
    **Difficulty**: Easy  
    **Topics**: String Manipulation  
    **Description**: Write a program to extract and sum all numbers present in a given string.  
    **Example**:  
    Input: `string = "The numbers are 12 and 34"`  
    Output: `46`  
    Explanation: The sum of numbers 12 and 34 is 46.
 */
public class Program15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        String arr[]=str.split(" ");
        ArrayList<Integer> al=new ArrayList<Integer>();
        for (String string : arr) {
            try{
                int i=Integer.parseInt(string);
                al.add(i);
            }catch(Exception e){
                continue;
            }
        }
        System.out.println(al);
        int sum=0;
        for (Integer integer : al) {
            sum+=integer;
        }
        System.out.println(sum);
    }
}
