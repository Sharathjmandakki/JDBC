package Set2;

import java.util.Scanner;

/*31. **Calculating the Sum of the First N Fibonacci Numbers**  
    **Difficulty**: Medium  
    **Topics**: Fibonacci Sequence, Mathematical Computations  
    **Description**: Write a program to calculate the sum of the first N Fibonacci numbers.  
    **Example**:  
    Input: `N = 5`  
    Output: `12`  
    Explanation: The first 5 Fibonacci numbers are 1, 1, 2, 3, 5, and their sum is 12.
 */
public class Program31 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int sum=0,n1=0,n2=1,n3;
        sc.close();
        if(N==1){
            System.out.println(n1);
        }else if(N==2){
            System.out.println(n1+n2);
        }else{
            sum=n1+n2;
            N-=2;
            while (N>0) {
                n3=n1+n2;
                sum+=n3;
                n1=n2;
                n2=n3;
                N--;
            }
            System.out.println(sum);
        }
    }
}
