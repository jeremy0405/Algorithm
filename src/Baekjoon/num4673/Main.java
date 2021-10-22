package Baekjoon.num4673;

public class Main{
    public static void main(String[] args){
        int Max = 10000;
        int[] selfnumArray = new int[Max];
        int a;

        // selfnumArray 에 1 ~ 10000 배열 생성
        for(int i=0; i<Max; i++){
            a = i+1;
            selfnumArray[i] = a;
            for(int j = a - 36; j < a; j++){
                if(a == j + j/1000+(j%1000)/100+(j%100)/10+j%10){
                    selfnumArray[i] = 0;
                    break;
                }
            }
        }


        for(int i=0; i<Max; i++){
            if(selfnumArray[i] != 0){
                System.out.println(selfnumArray[i]);
            }
        }

    }
}