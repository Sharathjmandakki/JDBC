package Set1;

import java.util.ArrayList;
import java.util.Scanner;

/*44. **Finding the Average of Numbers in an Array**  
    **Difficulty**: Easy  
    **Topics**: Arrays, Mathematical Computations  
    **Description**: Write a program to calculate the average of numbers in an array.  
    **Example**:  
    Input: `array = [1, 2, 3, 4, 5]`  
    Output: `3`  
    Explanation: The average of the numbers is (1 + 2 + 3 + 4 + 5) / 5 = 3.  
 */
public class program44 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        sc.close();
        int sum=0;
        for (Integer i : al) {
            sum+=i;
        }
        System.out.println(sum/al.size());
    }
}
