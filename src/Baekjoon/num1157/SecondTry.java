package Baekjoon.num1157;

import java.util.Scanner;

public class SecondTry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        sc.close();

        int[] cnt = new int[26];
        int max = 0;
        char result =' ';

        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 65]++;
            if (max < cnt[str.charAt(i) - 65]) {
                max = cnt[str.charAt(i) - 65];
                result = str.charAt(i);
            } else if (max == cnt[str.charAt(i) - 65]) {
                result = '?';
            }
        }
        System.out.println(result);

    }

}
