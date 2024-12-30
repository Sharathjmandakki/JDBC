package Set1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

/*41. **Finding the Count of Specific Digits in a Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, String Manipulation  
    **Description**: Write a program to count the occurrences of a specific digit in a number.  
    **Example**:  
    Input: `number = 122333`, `digit = 3`  
    Output: `3`  
    Explanation: The digit 3 occurs 3 times in the number 122333.  
 */
public class program41 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        sc.close();
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.addAll(al);
        int max = 0, ele = 0;
        for (int i : ts) {
            int temp = 0;
            for (int j : al) {
                if (i == j) {
                    temp++;
                }
            }
            if (temp > max) {
                max = temp;
                ele = i;
            }
        }
        System.out.print("number : "+ele+" occurrences in array "+ max+" times");
    }
}
