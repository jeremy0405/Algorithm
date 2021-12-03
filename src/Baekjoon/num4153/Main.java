package Baekjoon.num4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if ( a == 0 || b == 0 || c == 0) {
                System.out.println("wrong");
                continue;
            }

            int max = Math.max(a, Math.max(b, c));

            int left = max * max;

            if (a == max) {
                a = 0;
            } else if (b == max) {
                b = 0;
            } else if (c == max) {
                c = 0;
            }
            int right = a * a + b * b + c * c;

            if (left == right) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }

    }

}
