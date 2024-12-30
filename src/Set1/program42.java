package Set1;

import java.util.Scanner;

/*
 * 42. **Generating a Fibonacci Sequence Using Recursion**  
    **Difficulty**: Medium  
    **Topics**: Recursion, Sequences  
    **Description**: Write a recursive program to generate the Fibonacci sequence up to a given number.  
    **Example**:  
    Input: `number = 5`  
    Output: `0, 1, 1, 2, 3`  
    Explanation: The Fibonacci sequence up to 5 is generated.  

 */
public class program42 {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        Scanner sc=new Scanner(System.in);
        int numEle=sc.nextInt();
        if(numEle==1){
            System.out.println(n1);
        }else if(numEle==2){
            System.out.println(n1+", "+n2);
        }else{
            System.out.print(n1+", "+n2);
            numEle-=2;
            while (numEle>0) {
                n3=n1+n2;
                n1=n2;
                n2=n3;
                System.out.print(", "+n3);
                numEle--;
            }
        }
        sc.close();
    }
}
