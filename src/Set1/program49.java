package Set1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 
49. **Finding the Second Largest Number in an Array**  
    **Difficulty**: Medium  
    **Topics**: Arrays, Sorting  
    **Description**: Write a program to find the second largest number in an array.  
    **Example**:  
    Input: `array = [10, 20, 4, 45, 99]`  
    Output: `45`  
    Explanation: The second largest number in the array is 45.  

 */
public class program49 {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           ArrayList<Integer> al=new ArrayList<Integer>();
           while (sc.hasNextInt()) {
            al.add(sc.nextInt());
           }
           sort(al);
           Collections.sort(al);
           System.out.println(al.get(al.size()-2));
           sc.close();
    }
    public static void sort(ArrayList<Integer> al) {
        for(int i=0;i<al.size()-1;i++){
            if(al.get(i)>al.get(i+1)){
                int temp=al.get(i);
                al.set(i, al.get(i+1));
                al.set(i+1, temp);
            }
        }
        System.out.println(al.get(al.size()-2));
    }    
}
