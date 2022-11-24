package Programmers.보행자천국;

/*
	문제    : 프로그래머스 보행자천국
    유형    : dp
	난이도   : MEDIUM (level2)
	시간    : 60m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/1832
    날짜    : 22.11.23(o)
    refer  :
*/

class Solution {
	int MOD = 20170805;
	public int solution(int m, int n, int[][] cityMap) {
		// dp[][][0] 아래쪽, dp[][][1] 오른쪽
		int[][][] dp = new int[m + 1][n + 1][2];

		dp[1][1][0] = dp[1][1][1] = 1;

		for(int r = 1 ; r <= m ; ++r){
			for(int c = 1 ; c <= n ; ++c){
				if(cityMap[r - 1][c - 1] == 0){
					dp[r][c][0] += (dp[r - 1][c][0] + dp[r][c - 1][1]) % MOD;
					dp[r][c][1] += (dp[r - 1][c][0] + dp[r][c - 1][1]) % MOD;
				} else if(cityMap[r - 1][c - 1] == 1){
					dp[r][c][0] = 0;
					dp[r][c][1] = 0;
				} else {
					dp[r][c][0] = dp[r - 1][c][0];
					dp[r][c][1] = dp[r][c - 1][1];
				}
			}
		}
		return dp[m][n][0];
	}
}
