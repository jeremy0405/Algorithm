package Baekjoon.num8958;

import java.util.Scanner;

public class Main {

    private static int OArr(String s) {
        String[] OArr = s.split("X");

        int score = 0;

        for (int i = 0; i < OArr.length; i++) {
            int tmp = 0;
            for (int j = OArr[i].length(); j > 0; j--) {
                tmp += j;
            }
            score += tmp;
        }

        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        String[] str = new String[num];

        for (int i = 0; i < num; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < num; i++) {
            System.out.println(OArr(str[i]));
        }

    }

}
