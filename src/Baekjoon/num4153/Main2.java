package Baekjoon.num4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (a == 0 || b == 0 || c == 0) {
                sb.append("wrong\n");
                continue;
            }

            int max = Math.max(a, Math.max(b, c));

            int left = max * max;

            int right = a * a + b * b + c * c - max * max;

            if (left == right) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }
        }
        System.out.println(sb.toString());
    }

}
