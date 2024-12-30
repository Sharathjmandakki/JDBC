package Set2;
import java.util.Scanner;

/*20. **Finding the Sum of Diagonal Elements in a Matrix**  
    **Difficulty**: Easy  
    **Topics**: Matrix Operations  
    **Description**: Write a program to calculate the sum of the diagonal elements in a square matrix.  
    **Example**:  
    Input: `matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]`  
    Output: `15`  
    Explanation: The sum of the diagonal elements (1 + 5 + 9) is 15.
 */
public class Program20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rc=sc.nextInt();
        int arr[][]=new int[rc][rc];
        for (int i = 0; i <rc ; i++) {
            for (int j = 0; j < rc; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for (int i = 0; i < rc; i++) {
            for (int j = 0; j < rc; j++) {
                if(i==j){
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println(sum);
        sc.close();
    }
}
