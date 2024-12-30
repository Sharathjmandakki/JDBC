package Set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*16. **Finding the Longest Consecutive Sequence in an Array**  
    **Difficulty**: Medium  
    **Topics**: Arrays, Hashing  
    **Description**: Write a program to find the longest sequence of consecutive numbers in an array.  
    **Example**:  
    Input: `array = [100, 4, 200, 1, 3, 2]`  
    Output: `4`  
    Explanation: The longest consecutive sequence is [1, 2, 3, 4].
 */
public class Program16 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        Collections.sort(al);
        int j=1;
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i)==j){
                j++;
            }else{
                System.out.print(--j);
                break;
            }
        }
        sc.close();
    }
}
