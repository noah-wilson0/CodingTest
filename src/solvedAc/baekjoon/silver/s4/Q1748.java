package solvedAc.baekjoon.silver.s4;

import java.util.Scanner;

/** 음 좀 난감했다.
 * 제목: 수 이어 쓰기 1
 * 문제 링크: https://www.acmicpc.net/problem/1748
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 24
 *
 * 1. 문제 풀이 전략
 * 시간제한 0.15초?
 * 단순 loop는 안되는 게 확실하다 1~1억 이므로 시간 초과가 된다.
 * 글자수 갯수 = 숫자 갯수 * 자릿수
 * start number = 1~ 10, 100 ....
 * end number = min(10^(d-1),N)
 *
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
public class Q1748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = 0;
        int length = 1;
        int start = 1;

        while (start <= n) {
            int end = Math.min(start * 10 - 1, n);
            int count = end - start + 1;
            result += count * length;

            start *= 10;
            length++;
        }
        System.out.println(result);
    }
}
