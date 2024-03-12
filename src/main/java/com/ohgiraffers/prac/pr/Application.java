package com.ohgiraffers.prac.pr;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("신체질량 지수 계산");
        System.out.println("몸무게를 입력해주세요(kg) : ");
        double weight = sc.nextDouble();
        System.out.println("키를 입력해주세요 : ");
        double height = sc.nextDouble();

        double result = weight / (height * height);

        if(result <= 20) {
            System.out.println("당신은 저체중 입니다.");

        }
        else if(result >= 20 && result <= 25) {
            System.out.println("당신은 정상체중 입니다.");
        }
        if(result >= 25){
            System.out.println("당신은 과체중 입니다.");
        }

        System.out.println("프로그램을 종료합니다.");

    }
}
