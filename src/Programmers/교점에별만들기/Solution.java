package Programmers.교점에별만들기;

/*
	문제    : 프로그래머스 교점에 별 만들기
    유형    : 구현
	난이도   : (level 2)
	시간    : m
	uri    : https://school.programmers.co.kr/learn/courses/30/lessons/87377
    날짜    : 22.08.01(o)
    refer  :
*/

import java.util.*;

class Solution {
	public String[] solution(int[][] line) {

		List<long[]> list = new ArrayList<>();

		long maxX = -10000000;
		long minX = 10000000;
		long maxY = -10000000;
		long minY = 10000000;

		for(int i = 0; i < line.length; i++) {
			long a = line[i][0];
			long b = line[i][1];
			long e = line[i][2];

			for(int j = i + 1; j < line.length; j++) {
				long c = line[j][0];
				long d = line[j][1];
				long f = line[j][2];

				if (a * d - b * c == 0) {
					continue;
				}

				double x = ((b * f) - (e * d)) / (double) ((a * d) - (b * c));
				double y = ((e * c) - (a * f)) / (double) ((a * d) - (b * c));

				if (Math.floor(x) == Math.ceil(x) && Math.floor(y) == Math.ceil(y)) {
					list.add(new long[]{(long) x, (long) y});
					maxX = Math.max((long) x, maxX);
					minX = Math.min((long) x, minX);
					maxY = Math.max((long) y, maxY);
					minY = Math.min((long) y, minY);
				}
			}
		}

		int h = (int) (maxY - minY + 1);
		int w = (int) (maxX - minX + 1);

		char[][] marker = new char[h][w];

		for (int i = 0; i < h; i++) {
			Arrays.fill(marker[i], '.');
		}

		for (long[] a : list) {
			marker[(int) maxY - (int) a[1]][(int) a[0] - (int) minX] = '*';
		}

		String[] answer = new String[h];
		for (int i = 0; i < h; i++) {
			answer[i] = String.valueOf(marker[i]);
		}

		return answer;
	}
}
