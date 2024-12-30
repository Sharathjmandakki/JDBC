package Set1;

import java.util.Scanner;

/***Finding the Sum of Prime Numbers in a Range**  
    **Difficulty**: Medium  
    **Topics**: Number Theory, Mathematical Computations  
    **Description**: Write a program to calculate the sum of all prime numbers within a given range.  
    **Example**:  
    Input: `range = [1, 10]`  
    Output: `17`  
    Explanation: The sum of prime numbers between 1 and 10 is 2 + 3 + 5 + 7 = 17.  
 */
public class program35 {
    public static void main(String[] args) {
        System.out.println("range");
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        sc.close();
        int sum=0;
        for (int i = min; i <=max;i++) {
            if (isPrime(i)) {
                sum+=i;
            }
        }
        System.err.println(sum);
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
