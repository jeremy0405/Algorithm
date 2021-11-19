package Baekjoon.num2577;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int total = a * b * c;
        String num = String.valueOf(total);

        int[] answer = new int[10];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < num.length(); j++) {
                if (String.valueOf(num.charAt(j)).equals(String.valueOf(i))) {
                    answer[i]++;
                }
            }
        }

        for(int i = 0; i < answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
