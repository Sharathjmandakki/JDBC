package Set2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*43. **Checking for Anagram Pairs in a List of Strings**  
    **Difficulty**: Medium  
    **Topics**: String Manipulation  
    **Description**: Write a program to find pairs of strings in a list that are anagrams of each other.  
    **Example**:  
    Input: `strings = ["listen", "silent", "hello", "world"]`  
    Output: `[("listen", "silent")]`  
    Explanation: "listen" and "silent" are anagrams.
 */
public class Program43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();
        ArrayList<String> anagram = new ArrayList<>();
        System.out.println("to stop add *");
        while (sc.hasNext()) {
            String s = sc.next();
            if (s.contains("*")) {
                break;
            }
            al.add(s);
        }
        for (int i = 0; i < al.size(); i++) {
            for (int j = i; j < al.size() - 1; j++) {
                if (isAnagram(al.get(i), al.get(i + 1))) {
                    anagram.add(al.get(j));
                }
            }
        }
        System.out.println(anagram);
        sc.close();
    }

    public static boolean isAnagram(String str1, String str2) {
        char arr1[] = new char[str1.length()];
        char arr2[] = new char[str2.length()];
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String s1 = new String(arr1);
        String s2 = new String(arr2);
        if (s1.equalsIgnoreCase(s2)) {
            return true;
        }
        return false;
    }
}
