package Baekjoon.num10989;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SecondTry {

    public static void main(String[] args) throws IOException {
        int[] count = new int[10000];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            count[Integer.parseInt(br.readLine()) - 1]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            for (int j = 0; j < count[i]; j++) {
                sb.append( (i + 1) + "\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();
        bw.close();
    }
}
