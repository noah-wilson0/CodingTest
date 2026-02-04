package solvedAc.baekjoon.sprout.math;

import java.io.IOException;
import java.util.Scanner;

/**
 * 제목: 세탁소 사장 동혁
 * 문제 링크: https://www.acmicpc.net/problem/2720
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 26
 *
 * 1. 문제 풀이 전략
 *  전형적인 잔돈 문제이다.
 *  잔돈을 선언해놓고 큰 잔돈부터 거슬러 주는 로직을 적용한다.
 *  
 *2
 *  예외 케이스
 *
 *  반례
 * 
 * 3. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 4. 프로그래머스
 * solution(String s)메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 5. 이슈
 * 계산 과정을 화폐에 맞게 실수로 변환하여 계산하려니 부동 소수점 문제가 생긴다.=> 정수형으로 바꿔보자
 * C의 단위는 센트라고 하였다. 1$=100C
 * 
 */

public class Q2720 {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();


        for (int i = 0; i < t; i++) {
            int charge = sc.nextInt();

            int q=charge/25; charge%=25;
            int d=charge/10; charge%=10;
            int n=charge/5; charge%=5;
            int p=charge/1; charge%=1;


            System.out.println(String.format("%d %d %d %d", q, d, n, p));
        }


    }
}
