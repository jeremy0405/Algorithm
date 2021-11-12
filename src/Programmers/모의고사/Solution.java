package Programmers.모의고사;

class Solution {

    public int countCorrect(int[] answers, int[] student) {
        int count = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == student[i]) {
                count++;
            }
        }

        return count;
    }


    public int[] createAnswers(int[] pattern, int n) {
        int[] user = new int[n];

        int p = pattern.length;

        for (int i = 0; i < n; i++) {
            int j = i % p;
            user[i] = pattern[j];
        }

        return user;
    }


    public int[] solution(int[] answers) {
        int[] answer = {};

        int n = answers.length;

        int[] AsAnswer = new int[n];
        int[] BsAnswer = new int[n];
        int[] CsAnswer = new int[n];

        int[] A = {1, 2, 3, 4, 5};
        int[] B = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] C = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        AsAnswer = createAnswers(A, n);
        BsAnswer = createAnswers(B, n);
        CsAnswer = createAnswers(C, n);

        int Anum = countCorrect(answers, AsAnswer);
        int Bnum = countCorrect(answers, BsAnswer);
        int Cnum = countCorrect(answers, CsAnswer);

        int temp = Math.max(Anum, Bnum);
        int max = Math.max(Cnum, temp);

        if(Anum == max && Bnum == max && Cnum == max){
            answer = new int[]{1, 2, 3};
            return answer;
        } else if (Anum == max && Bnum == max) {
            answer = new int[]{1, 2};
            return answer;
        } else if (Bnum == max && Cnum == max) {
            answer = new int[]{2, 3};
            return answer;
        } else if (Anum == max && Cnum == max) {
            answer = new int[]{1, 3};
            return answer;
        } else if (Anum == max) {
            answer = new int[]{1};
            return answer;
        } else if (Bnum == max) {
            answer = new int[]{2};
            return answer;
        } else if (Cnum == max) {
            answer = new int[]{3};
            return answer;
        }
        answer = new int[]{5};
        return answer;
    }
}

class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1, 2, 3, 5, 3, 2, 1};

        Solution s = new Solution();

        int[] out = s.solution(numbers);

        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }

}
