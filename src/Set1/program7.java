package Set1;

import java.util.Scanner;

/*
 * 
 * **Crafting Star Patterns**  
   **Difficulty**: Easy  
   **Topics**: Basic Programming, Patterns  
   **Description**: Write a program to create different star patterns (e.g., pyramid, diamond).  
   **Example**:  
   Input: `patternType = "pyramid", height = 5`  
   Output:  
   ```
       *
      ***
     *****
    *******
   *********
   ```  
   Explanation: A pyramid pattern with a height of 5 is generated.
 * 
 */
public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("type");
        String type = sc.next();
        System.out.println();
        System.out.print("height");
        int height = sc.nextInt();
        System.out.println();
        if (type.equalsIgnoreCase("pyramid")) {
        pyramid(height);
        } else if (type.equalsIgnoreCase("Diamond")) {
        diamond(height);
        } else {
        System.err.println("try again");
        }
        sc.close();
    }

    public static void pyramid(int height) {
        for (int i = 0; i < height * 2-1; i++) {
            if (i % 2 == 0) {
                int temp = height-i;
                while (temp >= 0) {
                    System.out.print(" ");
                    temp--;
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void diamond(int height) {
        for (int i = 0; i <= height; i++) {
            int temp = height - i;
            while (temp > 0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = height - 1; i > 0; i--) {
            int temp = height - i;
            while (temp > 0) {
                System.out.print(" ");
                temp--;
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
