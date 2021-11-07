package Baekjoon.num3052;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        ArrayList<Integer> arrList = new ArrayList<>(42);

        for (int i = 0; i < 42; i++) {
            arrList.add(0);
        }

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            int idx = arr[i] % 42;
            int cnt = arrList.get(idx);
            arrList.set(idx, cnt + 1);
        }

        int cnt = 0;

        for (int i = 0; i < 42; i++) {
            if (arrList.get(i) != 0) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }

}
