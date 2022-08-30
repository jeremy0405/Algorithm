package Programmers.쿼드압축후개수세기;

/*
	문제    : 쿼드압축 후 개수 세기
    유형    : 분할정복, 재귀
	난이도   : EASY (level 2)
	시간    : 15m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/68936
    날짜    : 22.08.30(o)
    refer  :
*/

class Solution {

	int one = 0;
	int zero = 0;

	public int[] solution(int[][] arr) {
		int size = arr.length;

		findQuadTree(arr, 0, 0, size);

		return new int[]{zero, one};
	}

	private void findQuadTree(int[][] arr, int x, int y, int size) {
		if (size == 1) {
			if (arr[x][y] == 0) {
				zero++;
				return;
			} else {
				one++;
				return;
			}
		}

		if (!check(arr, x, y, size)) {
			findQuadTree(arr, x, y, size / 2);
			findQuadTree(arr, x + size / 2, y, size / 2);
			findQuadTree(arr, x, y + size / 2, size / 2);
			findQuadTree(arr, x + size / 2, y + size / 2, size / 2);
		} else {
			if (arr[x][y] == 0) {
				zero++;
			} else {
				one++;
			}
		}
	}

	private boolean check(int[][] arr, int x, int y, int size) {
		int tmp = arr[x][y];
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (arr[i][j] != tmp) {
					return false;
				}
			}
		}
		return true;
	}
}
