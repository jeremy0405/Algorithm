package Baekjoon.num1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<String> s = new ArrayList<>();

        int i = 0;
        while (st.hasMoreTokens()) {
            s.add(st.nextToken());
            i++;
        }

        System.out.println(i);

    }

}
