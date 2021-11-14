package Baekjoon.num2475;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> nums = new ArrayList<>();

        while (st.hasMoreTokens()) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        int total = 0;
        for (int i = 0; i < nums.size(); i++) {
            total += (int) Math.pow(nums.get(i), 2);
        }

        System.out.println(total % 10);

    }

}
