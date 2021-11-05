package Baekjoon.num2675;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();

        int[] R = new int[total];
        String[] S = new String[total];

        for(int i = 0; i < total; i++){
            R[i] = sc.nextInt();
            S[i] = sc.next();

            for(int k = 0; k < S[i].length(); k++) {
                for (int j = 0; j < R[i]; j++) {
                    System.out.print(S[i].charAt(k));
                }
            }

            System.out.println("");

        }

    }

}
