package solvedAc.baekjoon.silver.s4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 제출 일시: 2026-02-08
 * 제목: 카드 2
 * 문제 링크: https://www.acmicpc.net/problem/2164
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간: 13
 *
 * 1. 문제 접근 아이디어
 *    큐를 써서 첫번째는 버리고 두번째는 버리는 방식
 *
 * 2. 반례
 * 
 * 
 * 3. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 4. 프로그래머스
 * solution(String s)메서드  사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 * 
 * 5. 이슈
 * 
 */

public class Q2164 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> q = new LinkedList();
        int cnt = 1;
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (q.size()!=1){
            if (cnt % 2 == 0) {
                Integer poll = q.poll();
                q.add(poll);
            } else {
                q.poll();
            }
            cnt++;
        }
        if (!q.isEmpty()) {
            System.out.println(q.peek());
        }
        sc.close();

    }
}
