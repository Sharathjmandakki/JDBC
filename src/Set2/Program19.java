package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/*19. **Checking for Perfect Squares in a Range**  
    **Difficulty**: Easy  
    **Topics**: Mathematical Computations  
    **Description**: Write a program to check which numbers in a given range are perfect squares.  
    **Example**:  
    Input: `start = 1`, `end = 10`  
    Output: `[1, 4, 9]`  
    Explanation: Perfect squares between 1 and 10 are 1, 4, and 9.
 */
public class Program19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        // double sq=0;
        int sq=0;
        while (sq<end) {
            // sq=Math.pow(start, 2.0);
            // start++;
            // al.add((int)sq);
            sq=start*start;
            start++;
            al.add(sq);
        }
        System.out.println(al);
        sc.close();
    }
}
