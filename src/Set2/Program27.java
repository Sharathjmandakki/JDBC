package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/*27. **Finding the Largest Sum of a Subarray**  
    **Difficulty**: Medium  
    **Topics**: Arrays, Dynamic Programming  
    **Description**: Write a program to find the largest sum of any contiguous subarray.  
    **Example**:  
    Input: `array = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`  
    Output: `6`  
    Explanation: The largest sum is 6, from the subarray `[4, -1, 2, 1]`.
 */
public class Program27 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> in=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            in.add(sc.nextInt());
        }
        for (int i = 0; i < in.size(); i++) {
            ArrayList<Integer> a=new ArrayList<>();
            for (int j = i; j < in.size(); j++) {
                a.add(in.get(j));
                ArrayList<Integer> temp=new ArrayList<>();
                temp.addAll(a);
                al.add(temp);
            }
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (ArrayList<Integer> b : al) {
            int temp=0;
            for (Integer i : b) {
                temp+=i;
            }
            if(temp>max){
                max=temp;
            }
            if (temp<min) {
                min=temp;
            }
        }
        // System.out.println(al);
        System.out.println("Max : "+max+"\nMin : "+min);
        sc.close();
    }
}
