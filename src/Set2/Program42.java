package Set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*42. **Finding the Largest Element in Each Row of a Matrix**  
    **Difficulty**: Easy  
    **Topics**: Matrix Operations  
    **Description**: Write a program to find the largest element in each row of a matrix.  
    **Example**:  
    Input: `matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]`  
    Output: `[3, 6, 9]`  
    Explanation: The largest elements in each row are 3, 6, and 9.
 */
public class Program42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr the no rows");
        ArrayList al[]=new ArrayList[sc.nextInt()];
        ArrayList<Integer> res=new ArrayList<Integer>();
        for (int i = 0; i < al.length; i++) {
            System.out.println("enter any char to stop adding array of "+i+" index");
            ArrayList<Integer> a=new ArrayList<Integer>();
            while (sc.hasNextInt()) {
                a.add(sc.nextInt());
            }
            sc.nextLine();
            sc.nextLine();
            Collections.sort(a);
            al[i]=a;
        }
        for (ArrayList i : al) {
            res.add((int)i.get(i.size()-1));
        }
        System.out.println(res);
        sc.close();
    }
}
