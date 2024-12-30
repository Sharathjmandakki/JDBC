package Set1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * **Checking for Perfect Numbers**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to determine if a number is a perfect number.  
    **Example**:  
    Input: `number = 28`  
    Output: `Perfect Number`  
    Explanation: 28 is a perfect number because its divisors (1, 2, 4, 7, 14) sum up to 28.

 */
public class program20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<Integer>();
        int sum=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                list.add(i);
                sum+=i;
            }
        }
        System.out.println((num==sum)?"Perfect Number":"Not a Perfect number");
        System.err.println(list);
        sc.close();
    }
}
