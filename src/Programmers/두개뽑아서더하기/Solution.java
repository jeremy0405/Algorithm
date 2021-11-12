package Programmers.두개뽑아서더하기;

import java.util.Set;
import java.util.TreeSet;

public class Solution {

    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> s = new TreeSet<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                s.add(numbers[i] + numbers[j]);
            }
        }

        answer = new int[s.size()];
        Object[] o = s.toArray();

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) o[i];
        }

        return answer;
    }

}

class Main {

    public static void main(String[] args) {

        int[] numbers = {2, 1, 3, 4, 1};
        Solution s = new Solution();
        int[] out = s.solution(numbers);

        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }


    }
}
