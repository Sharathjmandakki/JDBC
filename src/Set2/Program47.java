package Set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

/*47. **Finding All Triplets in an Array That Sum to Zero**  
    **Difficulty**: Medium  
    **Topics**: Arrays, Sorting  
    **Description**: Write a program to find all unique triplets in an array that sum to zero.  
    **Example**:  
    Input: `array = [-1, 0, 1, 2, -1, -4]`  
    Output: `[[-1, -1, 2], [-1, 0, 1]]`  
    Explanation: The unique triplets that sum to zero are listed.
 */
public class Program47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        HashSet<ArrayList<Integer>> ts=new HashSet<ArrayList<Integer>>();
        for (int i = 0; i < al.size()-2; i++) {
            for (int j = i+1; j < al.size(); j++) {
                for (int k = j+1; k < al.size(); k++) {
                    if(al.get(i)+al.get(j)+al.get(k)==0){
                        ArrayList<Integer> a=new ArrayList<Integer>();
                        a.add(al.get(i));
                        a.add(al.get(j));
                        a.add(al.get(k));
                        Collections.sort(a);
                        ts.add(a);
                    }
                }
            }
        }
        System.out.println(ts);
        sc.close();
    }
}
