package Baekjoon.num10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] c = new char[s.length()];
        br.close();

        for (int i = 0; i < s.length(); i++) {
            c[i] = s.charAt(i);
        }
        // c[]
        // b a e k j o o n

        for (int i = (int)'a'; i <= (int)'z'; i++) {
            int num = -1;
            for(int j = 0; j < c.length; j++){
                if(c[j] == i){
                    num = j;
                    break;
                }
            }
            System.out.print(num + " ");
        }


    }

}
