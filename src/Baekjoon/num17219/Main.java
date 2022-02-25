package Baekjoon.num17219;

/*
	문제    : BOJ 비밀번호 찾기
    유형    : 이분 탐색
	난이도   : EASY(S4)
	시간    : 3m
	uri    : https://www.acmicpc.net/problem/17219
    날짜    : 22.02.26(o)
    refer  :
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		Map<String, String> data = new HashMap<>();

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			data.put(st.nextToken(), st.nextToken());
		}

		for (int i = 0; i < M; i++) {
			bw.write(data.get(br.readLine()) + "\n");
		}

		br.close();
		bw.flush();
		bw.close();
	}

}
