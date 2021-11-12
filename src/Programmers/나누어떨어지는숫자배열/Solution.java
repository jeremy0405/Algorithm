package Programmers.나누어떨어지는숫자배열;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        int[] arr = {2, 36, 1, 3};
        int divisor = 3;

        int[] answer = {};
        int[] cc = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                cc[i] = arr[i];
            }
        }

        Arrays.sort(cc);

        int idx = 0;

        for (int i = 0; i < cc.length; i++) {
            if(cc[i] != 0) {
                idx = i;
                break;
            }
        }

        if( idx == 0 && cc[0] == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[cc.length - idx];

            System.arraycopy(cc, idx, answer, 0, answer.length);
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.printf("%5d", answer[i]);
        }

    }

}
