package Set2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/***Finding the Second Smallest Number in an Array**  
    **Difficulty**: Easy  
    **Topics**: Arrays  
    **Description**: Write a program to find the second smallest number in an array.  
    **Example**:  
    Input: `array = [12, 13, 1, 10, 34, 1]`  
    Output: `10`  
    Explanation: The second smallest number in the array is 10. */
public class Program21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeSet<Integer> a=new TreeSet<Integer>();
        while (sc.hasNextInt()) {
            a.add(sc.nextInt());
        }
        ArrayList<Integer> b=new ArrayList<Integer>();
        b.addAll(a);
        System.out.println(b.get(1));
        sc.close();
    }
}
