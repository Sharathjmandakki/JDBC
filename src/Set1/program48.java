package Set1;

import java.util.Scanner;

/*48. **Finding the Sum of Prime Factors of a Number**  
    **Difficulty**: Medium  
    **Topics**: Number Theory, Mathematical Computations  
    **Description**: Write a program to find the sum of the prime factors of a given number.  
    **Example**:  
    Input: `number = 12`  
    Output: `5`  
    Explanation: The prime factors of 12 are 2 and 3, and their sum is 2 + 3 = 5.  
 */
public class program48 {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        for(int i=2;i<num;i++){
            if(num%i==0){
                if(isPrime(i)){
                    sum+=i;
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
    public static boolean isPrime(int num) {
        if(num==2){
            return true;
        }
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
