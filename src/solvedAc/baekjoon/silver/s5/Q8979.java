package solvedAc.baekjoon.silver.s5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 제목: 올림픽
 * 문제 링크: https://www.acmicpc.net/problem/8979
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 시간 초과
 *
 * 1. 문제 풀이 전략
 * 2차원 배열 [나라수][메달수]
 * 금,은,동메달 수를 가지고 정렬한다.
 * 금3/은2/동1 의 점수를 가지고 총점을 계산하여 Map에 저장한 후 정렬하여 leaderbord.get(k-1])의 등수 출력
 * 공동 처리는 어떻게 하지?
 * 등수만 출력하면 되기에 조건문으로 k일때만 출력하도록 한다.
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
 * 정렬하려고 하지말고 k국가보다 금/은/동 메달수를 더 가진 국가의 수를 세면 된다.
 *
 */
public class Q8979 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] array = new int[n+1][3];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int country = sc.nextInt();
            int g = sc.nextInt();
            int s = sc.nextInt();
            int c = sc.nextInt();
            array[country] = new int[]{g, s, c};
        }

        for (int i = 1; i <= n; i++) {
            if (i==k) continue;
        
            if (array[i][0] > array[k][0]) {
                cnt++;
            } else if (array[i][0] == array[k][0] && array[i][1] > array[k][1]) {
                cnt++;
            } else if (array[i][0] == array[k][0] && array[i][1] == array[k][1] && array[i][2] > array[k][2]) {
                cnt++;
            }
        }

        System.out.println(cnt+1);

    }
}
