package Set1;

import java.util.Scanner;

/*38. **Finding the Sum of Squares of Digits**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to find the sum of the squares of the digits of a number.  
    **Example**:  
    Input: `number = 123`  
    Output: `14`  
    Explanation: The sum of the squares of digits is 1^2 + 2^2 + 3^2 = 14.  
 */
public class program38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while (num>0) {
            int temp=num%10;
            sum+=temp*temp;
            num/=10;
        }
        System.out.print(sum);
        sc.close();
    }
}
