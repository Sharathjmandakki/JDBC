package Set3;

import java.util.Scanner;

/* */
public class Program15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        char arr[][]=new char[row][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new char[i+1];
        }
        char ch='A';
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=(char)(ch+i);
            }
        }
        for (char[] cs : arr) {
            for (char cs2 : cs) {
                System.out.print(cs2+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
