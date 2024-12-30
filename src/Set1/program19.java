package Set1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
 * **Finding Prime Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find all prime numbers within a given range.  
    **Example**:  
    Input: `range = [10, 30]`  
    Output: `[11, 13, 17, 19, 23, 29]`  
    Explanation: Prime numbers between 10 and 30 are 11, 13, 17, 19, 23, and 29.
 * 
 */
public class program19 {
    public static ArrayList<Integer> al=new ArrayList<Integer>();
    public static void main(String[] args) {
        System.out.println("enter the range");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        checkAndAdd(a,b);
        System.out.println(al);
        sc.close();
    }
    public static void checkAndAdd(int a,int b){
        for (int i = a; i <=b; i++) {
            if (isPrime(i)!=0) {
                al.add(i);
            }
        }
    }
    public static int isPrime(int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return 0;
            }
        }
        return num;
    }
}
