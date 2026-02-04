package solvedAc.baekjoon.sprout.MultiplesAndPrimeNumbers1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 제목: 약수들의 합
 * 문제 링크: https://www.acmicpc.net/problem/9506
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 10
 *
 * 1. 문제 풀이 전략
 *  완전수 출력
 *  ㅇ
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
 * Not -> NOT 오타
 * if (n == -1) break; 뺴먹음
 * 
 */

public class Q9506 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n == -1) break;
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    list.add(i);
                }
            }
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            if (sum == n) {
                StringBuilder sb = new StringBuilder();
                sb.append(n).append(" = ");

                for (int i = 0; i < list.size(); i++) {
                    sb.append(list.get(i));
                    if (i != list.size() - 1) sb.append(" + ");
                }

                System.out.println(sb);
            } else {
                System.out.println(String.format("%d is NOT perfect.", n));
            }
        }
        sc.close();
    }
}
