package Set1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * **Checking for Armstrong Numbers in a Range**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to find all Armstrong numbers within a given range.  
    **Example**:  
    Input: `range = [1, 500]`  
    Output: `[1, 153, 370, 371, 407]`  
    Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407. 
 * 
 */
public class program17 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the range");
        int min = sc.nextInt();
        int max = sc.nextInt();
        for (int i = min; i <= max; i++) {
            if (check(i) != 0) {
                al.add(i);
            }
        }
        System.out.println(al);
        sc.close();
    }

    public static int check(int num) {
        int res = 0, temp = num, len = 0;
        while (temp > 0) {
            temp /= 10;
            len++;
        }
        temp = num;
        while (temp > 0) {
            res += Math.pow(temp % 10, len);
            if(res>num){
                return 0;
            }
            temp /= 10;
        }
        if (res == num) {
            return num;
        }
        return 0;
    }
}
