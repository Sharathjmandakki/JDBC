package Set1;

import java.util.Scanner;

/**Checking for Prime Numbers**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Number Theory  
   **Description**: Write a program to determine if a number is prime.  
   **Example**:  
   Input: `number = 7`  
   Output: `Prime`  
   Explanation: 7 has no divisors other than 1 and itself, so it is a prime number.  
*/
public class program2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Eneter the number");
        long num=scan.nextLong();
        scan.close();
        for (int i = 2; i < num; i++) {
            if(num%i==0 || i==1){
                System.out.println("number is not a prime ");
                return;
            }
        }
        System.out.printf("Prime : %d",num);
    }
}
