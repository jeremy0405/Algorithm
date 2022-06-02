package Baekjoon.num1713;

/*
	문제    : BOJ 후보 추천하기
    유형    :
	난이도   :  (S2)
	시간    : m
	uri    : https://www.acmicpc.net/problem/1713
    날짜    : 22.06.03(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int countOfFrame = Integer.parseInt(br.readLine());
		int countOfRecommend = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		List<int[]> frame = new ArrayList<>();

		for (int i = 0; i < countOfRecommend; i++) {
			int studentId = Integer.parseInt(st.nextToken());

			if (frame.stream().anyMatch(p -> p[0] == studentId)) {
				int[] participant = frame.stream().filter(p -> p[0] == studentId).findAny().get();
				if (frame.stream().anyMatch(p -> p[0] == studentId + 1)) {
					participant[1] += 1;
					for (int j = frame.size() - 1; j >= 0; j--) {
						int[] findIdx = frame.get(j);
						if (findIdx[1] == participant[1]) {
							frame.remove(participant);
							frame.add(j, participant);
							break;
						}
					}
					continue;
				}
				participant[1] += 1;
				frame.sort((o1, o2) -> o1[1] - o2[1]);
				continue;
			}

			if (frame.size() < countOfFrame) {
				frame.add(new int[] {studentId, 1});
				frame.sort((o1, o2) -> o1[1] - o2[1]);
				continue;
			}

			frame.remove(0);
			frame.add(new int[] {studentId, 1});
			frame.sort((o1, o2) -> o1[1] - o2[1]);

		}

		frame.sort((o1, o2) -> o1[0] - o2[0]);

		StringBuilder sb = new StringBuilder();

		for (int[] participant : frame) {
			sb.append(participant[0]).append(' ');
		}

		System.out.println(sb);

	}
/*
3
9
1 2 1 3 4 5 6 2 3

1 2 3
 */
}
