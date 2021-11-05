package Baekjoon.num2920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        br.close();

        Boolean[] isAscending = new Boolean[8];
        Boolean[] isDescending = new Boolean[8];

        for (int i = 0; i < arr.length; i++) {
            isAscending[i] = arr[i] == i + 1;
            isDescending[i] = arr[i] == arr.length - i;
        }

        for (int i = 1; i < arr.length; i++) {
            isAscending[i] = isAscending[i] && isAscending[i - 1];
            isDescending[i] = isDescending[i] && isDescending[i - 1];
        }

        if (isAscending[7]) {
            System.out.println("ascending");
        } else if (isDescending[7]) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

    }

}

/*
public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[8];
        String output = null;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        } // arr 배열에 숫자 집어넣기

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1] - 1) {
                output = "ascending";

            } else if (arr[i] == arr[i + 1] + 1) {
                output = "descending";

            } else {
                output = "mixed";
                break;
            }
        }
        System.out.println(output);
    }
}
*/
