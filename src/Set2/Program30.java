package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/*30. **Finding the Longest Sequence of Consecutive 1s in a Binary Array**  
    **Difficulty**: Medium  
    **Topics**: Arrays, Binary Operations  
    **Description**: Write a program to find the longest sequence of consecutive 1s in a binary array.  
    **Example**:  
    Input: `array = [1, 1, 0, 1, 1, 1]`  
    Output: `3`  
    Explanation: The longest sequence of 1s is `[1, 1, 1]` with length 3.
 */
public class Program30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        int maxC=0;
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        int temp=0;
        for (Integer i : al) {
            if(i==0){
                temp=0;
            }
            if(i==1){
                temp++;
            }
            if(temp>maxC){
                maxC=temp;
            }
        }
        System.out.println(maxC);
        sc.close();
    }
}
