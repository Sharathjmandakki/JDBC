package Set1;

import java.util.Scanner;

/*
 ***Checking if a Number is a Narcissistic Number**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, Number Theory  
    **Description**: Write a program to check if a number is a narcissistic number (where the sum of its digits raised to the power of the number of digits equals the number itself).  
    **Example**:  
    Input: `number = 153`  
    Output: `Narcissistic Number`  
    Explanation: 153 is a narcissistic number because 1^3 + 5^3 + 3^3 = 153. 
 * 
 */
public class program26 {
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("number = ");
    int num = sc.nextInt();
    sc.close();
    usingNum(num);
    usingString(num);
  }

  public static void usingNum(int num) {
    int len = 0, result = 0, temp = num, res = num;
    while (temp > 0) {
      temp /= 10;
      len++;
    }
    while (res > 0) {
      result += Math.pow(res % 10, len);
      res /= 10;
    }
    if (result == num) {
      System.out.println("Narcissistic Number");
    } else {
      System.err.println("not a Narcissistic Number");
    }
    System.out.println("--------------------");
  }

  public static void usingString(int num) {
    String res = "" + num;
    int pow = res.length();
    int result = 0;
    for (int i = 0; i < res.length(); i++) {
      result += Math.pow(Integer.parseInt(res.charAt(i) + ""), pow);
    }
    if (result == num) {
      System.out.println("Narcissistic Number");
    } else {
      System.err.println("not an Narcissistic Number");
    }
  }
}
