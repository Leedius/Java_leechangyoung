package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int strike;
        int ball;

        //1)~2)
        int[] baseballGame = new int[3];
        for (int i = 0; i < baseballGame.length; i++) {
            baseballGame[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (baseballGame[i] == baseballGame[j]) {
                    i--;
                }
            }
        }

        System.out.println("숫자를 정했습니다. 게임을 시작합니다.");

        //3)
        int index = 0;
        strike = 0;
        ball = 0;
        boolean out = true;
        while(out){
            System.out.print(index+1 + " >> ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();

            if (baseballGame[0] == a) {
                strike++;
            }
            else if (baseballGame[0] == b) {
                ball++;
            }
            else if (baseballGame[0] == c) {
                ball++;
            }

            if (baseballGame[1] == a) {
                ball++;
            }
            else if (baseballGame[1] == b) {
                strike++;
            }
            else if (baseballGame[1] == c) {
                ball++;
            }

            if (baseballGame[2] == a) {
                ball++;
            }
            else if (baseballGame[2] == b) {
                ball++;
            }
            else if (baseballGame[2] == c) {
                strike++;
            }
            System.out.println(strike + "스트라이크 " + ball + "볼");
            index++;

            if(strike == 3){
                out = false;
            }
            else {
                strike = 0;
                ball = 0;
            }
        }
        System.out.println(index + "회만에 정답을 맞췄습니다.");
    }
}