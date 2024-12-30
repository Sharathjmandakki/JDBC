package Set1;
import java.util.Scanner;

/*
 * **Calculating the Sum of Even Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Mathematical Computations  
    **Description**: Write a program to find the sum of all even numbers within a given range.  
    **Example**:  
    Input: `range = [1, 10]`  
    Output: `30`  
    Explanation: The sum of even numbers between 1 and 10 is 2 + 4 + 6 + 8 + 10 = 30. 
 */
public class program21 {
    public static void main(String[] args) {
        int sum=0,num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        for (int i = num1; i <=num2; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
