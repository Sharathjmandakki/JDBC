package Set1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * **Finding the Sum of Elements in an Array**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Arrays  
    **Description**: Write a program to find the sum of elements in an array.  
    **Example**:  
    Input: `array = [1, 2, 3, 4, 5]`  
    Output: `15`  
    Explanation: The sum of the elements in the array is 15. 
 */
public class program16 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> al=new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            try {
                al.add(sc.nextInt());
            } catch (Exception e) {
                break;
            }
        }
        for (Integer integer : al) {
            sum+=integer;
        }
        System.out.println(sum);
        sc.close();
    }
}
