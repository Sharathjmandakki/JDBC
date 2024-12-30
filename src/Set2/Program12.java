package Set2;

import java.util.Scanner;

/*12. **Generating a Matrix of Fibonacci Numbers**  
    **Difficulty**: Medium  
    **Topics**: Arrays, Matrix Operations  
    **Description**: Write a program to generate a matrix where each element is a Fibonacci number.  
    **Example**:  
    Input: `size = 3`  
    Output:  
    ```
    1 1 2  
    3 5 8  
    13 21 34  
    ```
 */
public class Program12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int rc=sc.nextInt();
        int arr[][]=new int[rc][rc];
        int n1=0,n2=1,n3;
        for(int i=0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(i==0&&j==0||i==0&&j==1){
                    arr[0][0]=n1;
                    arr[0][1]=n2;
                }else{
                    n3=n1+n2;
                    n1=n2;
                    n2=n3;
                    arr[i][j]=n3;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.err.println();
        }
        sc.close();
    }
}
