package Baekjoon.num10814;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        String[][] p = new String[num][2];
        for (int i = 0; i < num; i++) {
            p[i] = sc.nextLine().split(" ");
        }

        Arrays.sort(p, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
//                if(o1[0].equals(o2[0])){
//                    return o1[1].compareTo(o2[1]);
//                }
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for (int i = 0; i < num; i++) {
            System.out.println(p[i][0] +  " " + p[i][1]);
        }


    }

}
