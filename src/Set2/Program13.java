package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/*13. **Finding the Sum of the First N Prime Numbers**  
    **Difficulty**: Medium  
    **Topics**: Prime Numbers, Mathematical Computations  
    **Description**: Write a program to calculate the sum of the first N prime numbers.  
    **Example**:  
    Input: `N = 4`  
    Output: `17`  
    Explanation: The sum of the first 4 prime numbers (2 + 3 + 5 + 7) is 17.
 */
public class Program13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> al=new ArrayList<Integer>();
        int number=2,sum=0;
        while (num>0) {
            if(isPrime(number)){
                al.add(number);
                num--;
            }
            number++;
        }
        for (int i : al) {
           sum+=i; 
        }
        System.out.println(sum);
        sc.close();
    }
    public static boolean isPrime(int i) {
        for (int j = 2; j <=i; j++) {
            if(j==i){
                return true;
            }else if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
