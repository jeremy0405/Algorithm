package Programmers.크레인인형뽑기게임;

/*
	문제    : 크레인 인형뽑기 게임
	uri    : https://programmers.co.kr/learn/courses/30/lessons/64061
*/

import java.util.Stack;

class Solution2 {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;

		Stack<Integer> stack = new Stack<>();

		//board[높이위에서부터 아래][좌에서 우]

		for (int i = 0; i < moves.length; i++) {

			for(int j = 0; j < board.length; j++) {

				if (board[j][moves[i]] != 0) {

					if (stack.size() != 0) {
						if (stack.peek() != board[j][moves[i]]) {
							stack.push(board[j][moves[i]]);
						} else {
							stack.pop();
							answer += 2;
						}
					} else if (stack.size() == 0) {
						stack.push(board[j][moves[i]]);
					}
					board[j][moves[i]] = 0;
				}

			}

		}

		return answer;
	}
}
