package solvedAc.baekjoon.sprout.math;

import java.util.Scanner;

/**
 * 제목: 벌집
 * 문제 링크: https://www.acmicpc.net/problem/2292
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 40
 *
 * 1. 문제 풀이 전략
 *  벌집의 중앙부터 시계 방향으로 돌아가면서 번호를 매긴다.
 *  중앙부터 N번 방까지 시작과 끝 방을 포함하여 몇개의 방을 지나가는가?
 *  요구 조건 자체가 지나갈 방의 갯수
 * N 방 Count
 *  1  1 1
 * 2~7 6 2
 * 8~19 12 3
 * 20~37 18 4
 * 규칙
 * 2부터 방은 6의 배수만큼 늘어난다.
 * range는 방의 범위 6* count는 range가 늘어날 규칙 count는 방의 갯수
 * range = range + (6* count)
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

public class Q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int range=2;
        int count=1;

        if (n == 1) {
            System.out.println(1);
        } else {
            while (range <= n) {
                range += (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
