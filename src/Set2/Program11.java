package Set2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/***Finding the Largest Prime Factor of a Number**  
    **Difficulty**: Medium  
    **Topics**: Number Theory  
    **Description**: Write a program to find the largest prime factor of a given number.  
    **Example**:  
    Input: `number = 28`  
    Output: `7`  
    Explanation: The prime factors of 28 are 2 and 7, with the largest being 7.
 */
public class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        ArrayList<Integer> fact=new ArrayList<Integer>();
        ArrayList<Integer> primeFact=new ArrayList<Integer>();
        for(int i=2;i<=number;i++){
            if(number%i==0){
                fact.add(i);
            }
        }
        for (Integer i : fact) {
            if(isPrime(i)){
                primeFact.add(i);
            }
        }
        Collections.sort(primeFact);
        System.out.println(primeFact.get(primeFact.size()-1));
        sc.close();
    }
    public static boolean isPrime(int i) {
        for (int j = 2; j <i; j++) {
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
}
