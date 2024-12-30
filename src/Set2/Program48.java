package Set2;

import java.util.Random;
import java.util.Scanner;

/*48. **Generating a Square Matrix with Random Values**  
    **Difficulty**: Easy  
    **Topics**: Random Number Generation, Matrix Operations  
    **Description**: Write a program to generate a square matrix where each element is a random value.  
    **Example**:  
    Input: `size = 3`  
    Output:  
    ```
    7 3 5  
    2 6 9  
    1 8 4  
    ```
 */
public class Program48 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int size=sc.nextInt();
        int arr[][]=new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=rand.nextInt(10);
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
}
