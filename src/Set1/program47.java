package Set1;

import java.util.Scanner;

/*47. **Generating a Number Pyramid**  
    **Difficulty**: Medium  
    **Topics**: Patterns, Basic Programming  
    **Description**: Write a program to generate a pyramid of numbers (e.g., 1, 12, 123, etc.).  
    **Example**:  
    Input: `rows = 4`  
    Output:  
    ```
    1  
    12  
    123  
    1234  
    ```  
    Explanation: A number pyramid with 4 rows is generated.  
 */
public class program47 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int arr[][]=new int[num][];
    for(int i=0;i<arr.length;i++){
        arr[i]=new int[i+1];
    }
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=j+1;
        }
    }
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
}    
}
