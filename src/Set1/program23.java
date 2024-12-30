package Set1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * **Finding the Fibonacci Number at a Specific Position**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Sequences  
    **Description**: Write a program to find the Fibonacci number at a specific position.  
    **Example**:  
    Input: `position = 5`  
    Output: `5`  
    Explanation: The Fibonacci number at position 5 is 5 (sequence: 0, 1, 1, 2, 3, 5).  

 */
public class program23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos, num1 = 0, num2 = 1, res = 0;
        pos = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(num1);al.add(num2);
        while (true) {
            if (al.size() > pos) {
                break;
            } else {
                res = num1 + num2;
                al.add(res);
                num1 = num2;
                num2 = res;
            }
        }
        System.out.println(al.get(pos));
        sc.close();
    }
}
