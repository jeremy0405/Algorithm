package Baekjoon.num11650;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());

        List<Point> arr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int x, y;
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            Point p = new Point(x, y);

            if (i == 0) {
                arr.add(p);
                continue;
            }

            int size = arr.size();

            Loop1:
            for (int j = 0; j < size; j++) {
                if (arr.get(j).getX() > x) {
                    arr.add(j, p);
                    break;
                } else if (arr.get(j).getX() == x) {
                    for (int k = j; k < size; k++) {
                        if (arr.get(k).getY() >= y) {
                            arr.add(k, p);
                            break Loop1;
                        } else {
                            arr.add(k + 1, p);
                            break Loop1;
                        }
                    }
                } else if ( arr.get(size - 1).getX() < x) {
                    arr.add(p);
                    break;
                }
            }
        }

        br.close();

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).getX() + " " + arr.get(i).getY());
        }
    }

    public static class Point {

        private int x;
        private int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
