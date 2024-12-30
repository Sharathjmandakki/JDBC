package Set1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*30. **Finding Missing Numbers in a Sequence**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Arrays  
    **Description**: Write a program to find missing numbers in a sequence from 1 to n.  
    **Example**:  
    Input: `sequence = [1, 2, 4, 5]`  
    Output: `[3]`  
    Explanation: The missing number in the sequence from 1 to 5 is 3. */
public class program30 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> missing = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            num.add(sc.nextInt());
        }
        Collections.sort(num);
        for (int i = 1; i < num.get(num.size() - 1); i++) {
            if (num.contains(i)) {
                continue;
            } else {
                missing.add(i);
            }
        }
        System.out.println(missing);
        sc.close();
    }
}
