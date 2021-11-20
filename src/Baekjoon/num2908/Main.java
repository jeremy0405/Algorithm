package Baekjoon.num2908;

import java.util.Scanner;

class Main {

    public static int reverse(int num) {
        int revNum;

        revNum = (num / 100) + (((num % 100) / 10) * 10) + ((num % 10) * 100);

        return revNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        num1 = reverse(num1);
        num2 = reverse(num2);

        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

    }
}
