package Set1;

import java.util.Scanner;

/*37. **Checking for Perfect Squares**  
    **Difficulty**: Easy  
    **Topics**: Mathematical Computations  
    **Description**: Write a program to determine if a number is a perfect square.  
    **Example**:  
    Input: `number = 16`  
    Output: `True`  
    Explanation: 16 is a perfect square (4^2 = 16).  
 */
public class program37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();
        if(num==1||num==0){
            System.out.print(true);
            return;
        }
        for (int i = 2; i <= num/2; i++) {
            if(Math.pow((double)i,2.0)==num){
                System.out.print(true);
                return;
            }
        }
        System.out.print(false);
        sc.close();
    }
}
