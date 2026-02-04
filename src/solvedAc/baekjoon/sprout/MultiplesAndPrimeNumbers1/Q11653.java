package solvedAc.baekjoon.sprout.MultiplesAndPrimeNumbers1;

import java.util.Scanner;

/**
 * 제목: 소인수분해
 * 문제 링크: https://www.acmicpc.net/problem/11653
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 10
 *
 * 1. 문제 풀이 전략
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
 * 소인수 분해 로직이 되는 이유는
 * n 값이 소인수 분해 while loop에서 변경되기 때문이다.
 * 
 */

public class Q11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n==1) return;

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
    }
}
