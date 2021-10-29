package Programmers.체육복;

import java.util.Arrays;

public class Solution {

    class solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = 0;
            answer = n - lost.length;

            Arrays.sort(lost);
            Arrays.sort(reserve);

            for (int i = 0; i < lost.length; i++) {
                for (int j = 0; j < reserve.length; j++) {

                    if (lost[i] == reserve[j]) {
                        answer++;
                        lost[i] = 50;
                        reserve[j] = 100;
                        continue;
                    }
                }
            }


            for (int i = 0; i < lost.length; i++) {
                for (int j = 0; j < reserve.length; j++) {
                    if (lost[i] - reserve[j] == 1) {
                        answer++;
                        lost[i] = 50;
                        reserve[j] = 100;
                        continue;
                    } else if (lost[i] - reserve[j] == -1) {
                        answer++;
                        lost[i] = 50;
                        reserve[j] = 100;
                        continue;
                    }

                }
            }

            return answer;
        }
    }
}
