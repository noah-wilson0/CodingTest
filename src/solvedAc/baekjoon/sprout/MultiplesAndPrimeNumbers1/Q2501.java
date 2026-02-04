package solvedAc.baekjoon.sprout.MultiplesAndPrimeNumbers1;

import java.util.Scanner;

/**
 * 제목: 약수 구하기
 * 문제 링크: https://www.acmicpc.net/problem/2501
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 12
 *
 * 1. 문제 풀이 전략
 * 약수를 구하고 오름차순 K번째 약수 출력
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
 * k번째 약수 없을 시 0 출력 까먹음
 * 
 */

public class Q2501 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt=1;
        boolean being = false;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (cnt == k) {
                    System.out.println(i);
                    being = true;
                    return;
                }
                cnt++;
            }
        }
        if (!being) System.out.println(0);
        sc.close();

    }
}
