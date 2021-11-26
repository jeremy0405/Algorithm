package Baekjoon.num9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < num; i++) {
            String s = sc.nextLine();
            System.out.println(checkVPS(s));
        }

    }

    private static String checkVPS(String s) {

        Stack st = new Stack();
        int len = s.length();
        char[] c = new char[len];

        try {
            for (int i = 0; i < len; i++) {
                c[i] = s.charAt(i);
                if (String.valueOf(c[i]).equals("(")) {
                    st.push(c[i]);
                } else {
                    st.pop();
                }
            }
        } catch (Exception e) {
            return "NO";
        }

        if(st.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }

    }

}
