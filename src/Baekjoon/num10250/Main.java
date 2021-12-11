package Baekjoon.num10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            hotel(st.nextToken(), st.nextToken(),st.nextToken());
        }

    }

    private static void hotel(String h, String w, String person) {
        int W = Integer.parseInt(w);
        int H = Integer.parseInt(h);
        int N = Integer.parseInt(person);


        // H W N

        int floor;
        int room;
        if(N % H != 0) {
            floor = (N % H);
        } else {
            floor = H;
        }
        if(N % H != 0) {
            room = (N / H) + 1;
        } else {
            room = (N / H);
        }

        System.out.printf("%d%02d\n", floor, room);

    }

}
