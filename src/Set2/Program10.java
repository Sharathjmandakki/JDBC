package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
10. **Finding the Number of Perfect Numbers Up to a Given Limit**  
    **Difficulty**: Medium  
    **Topics**: Number Theory  
    **Description**: Write a program to find how many perfect numbers exist up to a given limit.  
    **Example**:  
    Input: `limit = 30`  
    Output: `1`  
    Explanation: There is only one perfect number (6) up to 30.

 */
public class Program10 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int limit=sc.nextInt();
       ArrayList<Integer> al=new ArrayList<Integer>();
       for (int i = 1; i <= limit; i++) {
        if (isPerfect(i)) {
            al.add(i);
        }
       }
       System.out.println(al);
       System.out.println(al.size());
       sc.close(); 
    }
    public static boolean isPerfect(int num) {
        int sum=0;
        for (int i = 1; i <num; i++) {
            if(num%i==0){
                System.out.print(i+"+");
                sum+=i;
            }
        }
        System.err.println();
        if(sum==num){
            return true;
        }
        return false;
    }
}
