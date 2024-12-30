package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/*49. **Finding the Difference Between the Sum of Even and Odd Numbers in an Array**  
    **Difficulty**: Easy  
    **Topics**: Arrays, Mathematical Computations  
    **Description**: Write a program to calculate the difference between the sum of even and odd numbers in an array.  
    **Example**:  
    Input: `array = [1, 2, 3, 4, 5, 6]`  
    Output: `4`  
    Explanation: The sum of even numbers is 12, and the sum of odd numbers is 8. The difference is 4.
 */
public class Program49 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        sc.close();
        int even=0,odd=0;
        for (Integer i : al) {
            if(i%2==0){
                even+=i;
            }else{
                odd+=i;
            }
        }
        System.out.println((int)Math.abs(even-odd));

    }
}
