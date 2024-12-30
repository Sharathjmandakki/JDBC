package Set1;

import java.util.Scanner;

/***Validating Leap Years**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Date Handling  
   **Description**: Write a program to check if a given year is a leap year.  
   **Example**:  
   Input: `year = 2020`  
   Output: `Leap Year`  
   Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year. */
public class program3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        long year=sc.nextLong();
        if (year%4==0) {
            System.out.print("Leap year");
        }else{
            System.out.println("Not leap year");
        }
        sc.close();
    }
}
