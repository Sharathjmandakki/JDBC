package Set1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

/*45. **Finding the Mode of Numbers in an Array**  
    **Difficulty**: Medium  
    **Topics**: Arrays, Statistical Analysis  
    **Description**: Write a program to find the mode (most frequent number) in an array.  
    **Example**:  
    Input: `array = [1, 2, 2, 3, 4, 4, 4]`  
    Output: `4`  
    Explanation: The most frequent number in the array is 4.  
 */
public class program45 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(al);
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
        System.out.print("number : "+ele+" reoccured in array "+ max+" times");
    }
}
