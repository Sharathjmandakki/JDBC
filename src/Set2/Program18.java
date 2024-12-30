package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/* **Finding All Subsets of a Set**  
    **Difficulty**: Medium  
    **Topics**: Combinatorics  
    **Description**: Write a program to generate all possible subsets of a given set of numbers.  
    **Example**:  
    Input: `set = [1, 2]`  
    Output: `[[], [1], [2], [1, 2]]`  
    Explanation: The subsets of [1, 2] are the empty set, [1], [2], and [1, 2].
 */
public class Program18 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        Scanner sc = new Scanner(System.in);
        al.add(null);
        ArrayList<Integer> set = new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            set.add(sc.nextInt());
        }
        for (int i = 0; i < set.size(); i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = i; j < set.size(); j++) {
                temp.add(set.get(j));
                ArrayList<Integer> demo = new ArrayList<Integer>();
                demo.addAll(temp);
                al.add(demo);
            }
        }
        System.out.println(al);
        sc.close();
    }
}
