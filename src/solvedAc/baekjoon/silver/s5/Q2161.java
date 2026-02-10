package solvedAc.baekjoon.silver.s5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 제목: 카드1
 * 문제 링크: https://www.acmicpc.net/problem/2161
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 3
 *
 * 1. 문제 풀이 전략
 *  StringBuilder로 출력문 작성하기
 *  큐 사용
 * 짝 카운트 번호는 큐에 추가
 * 홀 카운트는 StringBuilder에 추가
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
public class Q2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList();
        int cnt = 1;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) queue.offer(i);

        while (!queue.isEmpty()) {
            Integer poll = queue.poll();
            if (cnt % 2 != 0) {
                sb.append(poll + " ");
            } else {
                queue.offer(poll);
            }
            cnt++;
        }
        System.out.println(sb.toString().trim());
    }
}
