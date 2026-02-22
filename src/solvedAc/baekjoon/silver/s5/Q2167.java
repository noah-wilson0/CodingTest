package solvedAc.baekjoon.silver.s5;

import java.util.Scanner;

/**
 * 제목: 2차원 배열의 합
 * 문제 링크: https://www.acmicpc.net/problem/2167
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 
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
public class Q2167 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] array = new int[n][m];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int num = sc.nextInt();
                array[i][j] = num;
            }
        }
        int t = sc.nextInt();

        for (int z = 0; z < t; z++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int x = sc.nextInt() - 1;
            int y = sc.nextInt() - 1;
            int sum = 0;
            for (int k = i; k <= x; k++) {
                for (int l = j; l <= y; l++) {
                    sum += array[k][l];
                }
            }
            sb.append(sum + "\n");
        }
        System.out.println(sb);

    }
}
