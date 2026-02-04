package solvedAc.baekjoon.sprout.MultiplesAndPrimeNumbers1;

import java.util.Scanner;

/**
 * 제목: 소수 찾기
 * 문제 링크: https://www.acmicpc.net/problem/1978
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 28
 *
 * 1. 문제 풀이 전략
 * 소수의 갯수 구하기
 * loop로 소수인것만 세도 되지만 더 좋은 방법이 뭘까?
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

public class Q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c=0;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean isPrime = true;
            if (n == 0 || n == 1) continue;

            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) c++;
        }
        System.out.println(c);
    }
}
