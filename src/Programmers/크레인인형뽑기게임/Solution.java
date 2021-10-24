package Programmers.크레인인형뽑기게임;

import java.util.*;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> baguni = new ArrayList<Integer>();

        // 0 h
        // 1 h
        // 2 h
        //     w w w w    board[h][w];
        //     0 1 2 3

        for(int i = 0; i < moves.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    baguni.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1] = 0;
                    break;
                }
            }
        }


        for(int i = baguni.size()-1; i > 0; i--){
            if(baguni.get(i) == baguni.get(i-1)){
                baguni.remove(i);
                baguni.remove(i-1);
                answer += 2;
            }
        }

        return answer;
    }
}