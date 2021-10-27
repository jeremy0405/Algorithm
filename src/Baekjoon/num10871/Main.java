package Baekjoon.num10871;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num = sc.nextInt();

        for(int i = 1; i <= t; i++){
            int a = sc.nextInt();
            if(a < num) {
                System.out.print(a + " ");
            }
        }
    }
}