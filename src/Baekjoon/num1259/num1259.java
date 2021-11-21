package Baekjoon.num1259;

import java.util.Scanner;

public class num1259 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String num = "";
        while (true) {
            num = sc.nextLine();
            if(num.equals("0")){
                break;
            }
            System.out.println(printYesNo(num));
        }


    }

    private static String printYesNo(String num) {
        String mun = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            mun += String.valueOf(num.charAt(i));
        }
        if (mun.equals(num)) {
            return "yes";
        } else {
            return "no";
        }
    }

}
