package Set1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 
24. **Printing Prime Numbers Less Than a Given Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to print all prime numbers less than a given number.  
    **Example**:  
    Input: `number = 20`  
    Output: `2, 3, 5, 7, 11, 13, 17, 19`  
    Explanation: The prime numbers less than 20 are 2, 3, 5, 7, 11, 13, 17, and 19.  
 */
public class program24 {
    public static ArrayList<Integer> al=new ArrayList<Integer>();
    public static void main(String[] args) {
        System.out.println("number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        checkAndAdd(num);
        System.out.println(al);
        sc.close();
    }
    public static void checkAndAdd(int num){
        for (int i = 2; i <num; i++) {
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