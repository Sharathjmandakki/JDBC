package Set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*33. **Finding the Median of a List of Numbers**  
    **Difficulty**: Medium  
    **Topics**: Sorting, Mathematical Computations  
    **Description**: Write a program to find the median value of a list of numbers.  
    **Example**:  
    Input: `list = [3, 1, 4, 1, 5]`  
    Output: `3`  
    Explanation: After sorting the list to [1, 1, 3, 4, 5], the median is 3.
 */
public class Program33 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        sc.close();
        Collections.sort(al);
        int size=al.size();
        if(size%2==1){
            System.out.println(al.get(size/2));
        }else{
            System.out.println((al.get(size/2)+al.get((size/2)-1))/2);
        }
    }
}
