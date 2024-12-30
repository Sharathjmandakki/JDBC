package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/***Finding All Pairs of Elements in an Array that Add Up to a Given Sum**  
   **Difficulty**: Medium  
   **Topics**: Arrays, Hashing  
   **Description**: Write a program to find all pairs of elements in an array whose sum equals a specified target.  
   **Example**:  
   Input: `array = [1, 2, 3, 4, 5]`, `target = 5`  
   Output: `[(1, 4), (2, 3)]`  
   Explanation: Pairs that sum up to 5 are (1, 4) and (2, 3).
 */
public class Program4 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     ArrayList<Integer> al=new ArrayList<Integer>();
     ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
     System.out.println("enter the target value");
     int target=sc.nextInt();
     System.out.println("enetr array elements");
     while (sc.hasNext()) {
        try{
            al.add(sc.nextInt());
        }catch(Exception e){
            break;
        }
     }
     for (int i = 0; i < al.size()-1; i++) {
        for (int j = i+1; j < al.size(); j++) {
            ArrayList<Integer> temp=new ArrayList<Integer>();
            if(al.get(i)+al.get(j)==target){
                temp.add(al.get(i));
                temp.add(al.get(j));
            }
            if(temp.size()>0||temp.size()==2){
                res.add(temp);
            }
        }
     }
     System.out.println(res);
     sc.close();   
    }
}
