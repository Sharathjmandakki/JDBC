package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/***Finding the GCD of Multiple Numbers**  
   **Difficulty**: Medium  
   **Topics**: Mathematical Computations  
   **Description**: Write a program to find the GCD (Greatest Common Divisor) of an array of numbers.  
   **Example**:  
   Input: `array = [12, 24, 36]`  
   Output: `12`  
   Explanation: The GCD of 12, 24, and 36 is 12.
 */
public class Program8 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }
        sc.close();
        int gcd=0;
        for (int i = 0; i < al.size(); i++) {
            if(gcd==0){
                gcd=GCD(al.get(i), al.get(i+1));
            }else{
                gcd=GCD(gcd, al.get(i));
            }
        }

        System.out.println(gcd);
    }

    public static int GCD(int a,int b) {
        if(b==0){
            return a;
        }else{
            return GCD(b,a%b);
        }
    }
}
