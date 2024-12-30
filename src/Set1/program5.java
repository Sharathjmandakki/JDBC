package Set1;
import java.util.*;

/*
 * **Generating the Fibonacci Series**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Sequences  
   **Description**: Write a program to generate the Fibonacci series up to a given number.  
   **Example**:  
   Input: `limit = 10`  
   Output: `[0, 1, 1, 2, 3, 5, 8]`  
   Explanation: The Fibonacci series up to 10 is generated as [0, 1, 1, 2, 3, 5, 8].
 * 
 */

public class program5 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.print("limit = ");
     int num1=0,num2=1;
     int limit=sc.nextInt();
     if(limit==0){
        System.out.println("[0]");
     }else if(limit==1){
        System.out.println("[0, 1, 1]");
     }else{
        System.out.print("[0, 1");
        int temp=0;
        while (temp<=limit) {
            temp=num1+num2;
            if(temp>limit){
                break;
            }
           System.out.print(", "+temp);
           num1=num2;
           num2=temp; 
        }
        System.out.println("]");
     }   
   sc.close(); 
   }
}
