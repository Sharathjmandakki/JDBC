package Set1;

/*
 * 
 * **Calculating Armstrong Numbers**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Number Theory  
   **Description**: Write a program to check if a number is an Armstrong number.  
   **Example**:  
   Input: `number = 153`  
   Output: `Armstrong Number`  
   Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.  
 * 
 */
import java.util.Scanner;

public class program4 {
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
      System.out.println("Armstrong Number");
    } else {
      System.err.println("not an Armstrong Number");
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
      System.out.println("Armstrong Number");
    } else {
      System.err.println("not an Armstrong Number");
    }
  }
}
