package Baekjoon.num1296;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int num = sc.nextInt();

        String[] team = new String[num];
        int[] score = new int[num];


        // 이름에서 L O V E 개수 체크
        int name_L = 0, name_O = 0, name_V = 0, name_E = 0;

        for(int i =0; i< name.length(); i++){
            if('L' == name.charAt(i)){
                name_L++;
            }
            if('O' == name.charAt(i)){
                name_O++;
            }
            if('V' == name.charAt(i)){
                name_V++;
            }
            if('E' == name.charAt(i)){
                name_E++;
            }
        }


        // 팀 명과 이름에서 전체 L O V E 개수 추출 후 score 배열 생성
        for (int i = 0; i < num; i++) {
            team[i] = sc.next();

            int L = name_L, O = name_O, V = name_V, E = name_E;

            for(int j = 0; j < team[i].length(); j++) {
                if('L' == team[i].charAt(j)){
                    L++;
                }
                if('O' == team[i].charAt(j)){
                    O++;
                }
                if('V' == team[i].charAt(j)){
                    V++;
                }
                if('E' == team[i].charAt(j)){
                    E++;
                }
            }
            score[i] = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E)) % 100;
        }

        String max_name;
        String answer = "";
        int max = -100;
        int idx = 0;
        for(int i = 0; i < num; i++){
            if(max == score[i]){
                String[] sort = {team[i], team[idx]};
                Arrays.sort(sort);
                answer = sort[0];
                if(!team[idx].equals(sort[0])) idx = i;
            } else if(max < score[i]){
                max = score[i];
                idx = i;
                answer = team[i];
            }
        }

        System.out.println(answer);

    }
}
