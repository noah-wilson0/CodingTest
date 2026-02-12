package solvedAc.baekjoon.silver.s4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * 제목: 제로
 * 문제 링크: https://www.acmicpc.net/problem/10773
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 42~47
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
 *
 *
 */
public class Q10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque();
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int num = sc.nextInt();
            if (num != 0) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}
