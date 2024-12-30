package Set1;

import java.util.Scanner;
import java.util.*;

/*
 * **Finding the Largest and Smallest Numbers in an Array**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Arrays  
    **Description**: Write a program to find the largest and smallest numbers in an array.  
    **Example**:  
    Input: `array = [4, 7, 1, 8, 5]`  
    Output: `Largest: 8, Smallest: 1`  
    Explanation: The largest number in the array is 8 and the smallest is 1.  
 * 
 */
public class program14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        while (sc.hasNext()) {
            try {
                int i = sc.nextInt();
                al.add(i);
            } catch (Exception e) {
                break;
            }
        }
        sort(al);
        System.out.printf("Smallest %d and Largest %d", al.get(0), al.get(al.size() - 1));

        // using collection becouse of dinamic lenbgth of array
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.addAll(al);
        System.out.printf("Smallest %d and Largest %d", ts.first(), ts.last());
        sc.close();
    }

    public static void sort(ArrayList<Integer> al) {
        for (int i = 0; i < al.size() - 1; i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i) > al.get(j)) {
                    int temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
    }
}
