package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/***Generating a Pattern of Prime Numbers**  
    **Difficulty**: Medium  
    **Topics**: Prime Numbers, Patterns  
    **Description**: Write a program to generate a pattern where each row contains the first few prime numbers.  
    **Example**:  
    Input: `rows = 3`  
    Output:  
    ```
    2  
    2 3  
    2 3 5  
    ```
 */
public class Program38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        ArrayList<Integer> prime=primeNumbers(num);
        int arr[][]=new int[num][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=prime.get(j);
            }
        }
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    public static ArrayList<Integer> primeNumbers(int num) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int i=2;
        while (num>0) {
            if (isPrime(2)) {
                al.add(i);
                num--;
            }
            i++;
        }
        return al;
    }
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
