package Set2;

import java.util.ArrayList;
import java.util.Scanner;

/*39. **Finding the Common Elements in Two Arrays**  
    **Difficulty**: Medium  
    **Topics**: Arrays  
    **Description**: Write a program to find common elements between two arrays.  
    **Example**:  
    Input: `array1 = [1, 2, 3, 4]`, `array2 = [3, 4, 5, 6]`  
    Output: `[3, 4]`  
    Explanation: The common elements between the two arrays are 3 and 4.
 */
public class Program39 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer> n1=new ArrayList<Integer>();
    ArrayList<Integer> n2=new ArrayList<Integer>();
    while (sc.hasNextInt()) {
        n1.add(sc.nextInt());
    }
    sc.nextLine();
    sc.nextLine();
    while (sc.hasNextInt()) {
        n2.add(sc.nextInt());
    }

    // sub array
    ArrayList<ArrayList<Integer>> sub1=subArrays(n1);
    ArrayList<ArrayList<Integer>> sub2=subArrays(n2);
    // common sub array
    ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
    for (ArrayList<Integer> a : sub1) {
        if(sub2.contains(a)){
            res.add(a);
        }
    }
// common elements
    ArrayList<Integer> al=new ArrayList<>();
    int len=0;
    for (ArrayList<Integer> i : res) {
        int temp=i.size();
        if(temp>len){
            al.clear();
            len=temp;
            al.addAll(i);
        }
    }
    System.out.println(al);
    sc.close();
  }  
  public static ArrayList<ArrayList<Integer>> subArrays(ArrayList<Integer> n) {
    ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
    for (int i = 0; i < n.size(); i++) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        for (int j = i; j < n.size(); j++) {
            a.add(n.get(j));
            ArrayList<Integer> temp=new ArrayList<Integer>();
            temp.addAll(a);
            al.add(temp);
        }
    }
    return al;
  }
}
