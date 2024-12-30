package Set1;

import java.util.Scanner;

/*
 * **Counting Vowels and Consonants in a String**  
    **Difficulty**: Easy  
    **Topics**: Basic Programming, String Manipulation  
    **Description**: Write a program to count vowels and consonants in a given string.  
    **Example**:  
    Input: `string = "hello world"`  
    Output: `Vowels: 3, Consonants: 7`  
    Explanation: "hello world" contains 3 vowels (e, o, o) and 7 consonants (h, l, l, w, r, l, d). 
 * 
 */
public class program12 {
    public static void main(String[] args) {
        int Vowels=0,Consonants=0,otherChar=0;
        char ch;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
               Vowels++; 
            }else{
                String sptl="!@#$%^&*()_+-=[]{}':;<>,./?~`' ";
                if(sptl.contains(ch+"")){
                    otherChar++;
                }else{
                    Consonants++;
                }
            }
        }
        sc.close();
        System.out.printf("Vowels = %d, Consonants = %d, otherChar = %d",Vowels,Consonants,otherChar);
    }
}
