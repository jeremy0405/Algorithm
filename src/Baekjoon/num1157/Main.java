package Baekjoon.num1157;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static char getChar(char[] c, int n) {
        char output;
        if (n == 1) {
            output = c[0];
            return output;
        }

        int[] cnt = new int[26];
        int j = 0;

        for (int i = 1; i < n; i++) {
            if (c[i] == c[i - 1]) {
                cnt[j]++;
            } else {
                j++;
            }
        }

        int MAX = 0;
        int idx = 0;
        for(int i = 0; i < 26; i++){
            if(MAX < cnt[i]){
                MAX = cnt[i];
                idx = i + 1;
            }
        }

        for(int i = 0; i < 26; i++){
            if(MAX == cnt[i]){
                if(i != idx - 1){
                    return '?';
                }
            }
        }
        return c[idx];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String S = s.toUpperCase();

        char[] c = new char[S.length()];

        for (int i = 0; i < S.length(); i++) {
            c[i] = S.charAt(i);
        }

        Arrays.sort(c);

        System.out.println(getChar(c, c.length));

    }

}
