package solvedAc.baekjoon.sprout.math;

import java.util.Scanner;

/**
 * 제목: 진법 변환
 * 문제 링크: https://www.acmicpc.net/problem/2745
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 5
 *
 * 1. 문제 풀이 전략
 *  N을 B 진법으로 바꾸기
 *  16진법 hex이상 진법 을 10진법으로 어떻게 바꾸지?
 *
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
 *
 *
 */

public class Q2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();

        System.out.println(Integer.parseInt(n,b));
    }
}
