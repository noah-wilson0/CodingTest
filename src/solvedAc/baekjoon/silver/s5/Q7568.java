package solvedAc.baekjoon.silver.s5;

import java.util.Scanner;

/**
 * 제목: 덩치
 * 문제 링크: https://www.acmicpc.net/problem/7568
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 6~17=11
 *
 * 1. 문제 풀이 전략
 *  나열된 사람들을 loop를 돌며 사람의덩치보다 큰 사람 수 +1 을 해서 등수를 출력한다.
 * sb를 써서 등수를 붙인다.
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
public class Q7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        int[][] peoples = new int[n][2];

        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            peoples[i][0] = w;
            peoples[i][1] = h;
        }

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if(i!=j) {

                    if (peoples[i][0] < peoples[j][0] && peoples[i][1] < peoples[j][1]) {
                        cnt++;
                    }
                }
            }
            sb.append(cnt + 1 + " ");
        }
        System.out.println(sb.toString().trim());
    }
}
