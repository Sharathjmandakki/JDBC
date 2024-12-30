package Set2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*26. **Finding the Count of a Specific Word in a String**  
    **Difficulty**: Easy  
    **Topics**: String Manipulation  
    **Description**: Write a program to count how many times a specific word appears in a given string.  
    **Example**:  
    Input: `string = "hello world hello"`  
    Output: `2`  
    Explanation: The word "hello" appears 2 times in the string.
 */
public class Program26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");
        HashMap<String ,Integer> mp=new HashMap<String,Integer>();
        for (String s : arr) {
            if (mp.containsKey(s)) {
                mp.put(s, mp.get(s)+1);
            }else{
                mp.put(s, 1);
            }
        }
        int max=0;
        String res="";
        for (Map.Entry<String,Integer> m:mp.entrySet()) {
            int temp=m.getValue(); String s=m.getKey();
            if(temp>max){
                res=s;
                max=temp;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
