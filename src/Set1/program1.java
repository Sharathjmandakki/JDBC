package Set1;
import java.util.Scanner;

/*
 1. **Determining Even/Odd Numbers**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming  
   **Description**: Write a program to check whether a number is even or odd.  
   **Example**:  
   Input: `number = 4`  
   Output: `Even`  
   Explanation: Since 4 is divisible by 2, it is an even number. 
 * 
 */
public class program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a nume to check it is eveen or odd ");
        try {
            long num = scan.nextLong();
            scan.close();
            if (num % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
