package solvedAc.baekjoon.sprout.MultiplesAndPrimeNumbers1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 제목: 소수
 * 문제 링크: https://www.acmicpc.net/problem/2581
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 9
 *
 * 1. 문제 풀이 전략
 *   M~N의 범위내 소수들의 합과 최솟값을 구하시오.
 *   소수가 없을 경우 -1 출력
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
 * 0,1 제외 조건문 누락
 * 소수 구하기 위한 loop 범위 잘못지정
 *
 */

public class Q2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = m; i <= n; i++) {
            boolean isPrime = true;
            if (i<2) continue;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) list.add(i);
        }
        if (list.size() == 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            System.out.println(sum);
            System.out.println(list.get(0));
        }
        sc.close();
    }
}
