package Set1;

import java.util.ArrayList;
// import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        while (sc.hasNextInt()) {
            try {
                int i = sc.nextInt();
                al.add(i);
            } catch (Exception e) {
                break;
            }
        }
        sort(al);
        // Collections.sort(al);
        System.out.print("[");
        for (Integer integer : al) {
            System.out.print(integer + ", ");
        }
        System.out.print("]");
        System.err.println();
        // using collection becouse of dinamic lenbgth of array
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.addAll(al);
        System.out.print("[");
        for (Integer integer : ts) {
            System.out.print(integer + ", ");
        }
        System.out.print("]");
        sc.close();
    }

    public static void sort(ArrayList<Integer> al) {
        for (int i = 0; i < al.size() - 1; i++) {
            for (int j = i + 1; j < al.size(); j++) {
                if (al.get(i) > al.get(j)) {
                    int temp = al.get(i);
                    al.set(i, al.get(j));
                    al.set(j, temp);
                }
            }
        }
    }
}
