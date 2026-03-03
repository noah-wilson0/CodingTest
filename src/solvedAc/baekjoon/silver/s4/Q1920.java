package solvedAc.baekjoon.silver.s4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 제목: 수 찾기
 * 문제 링크: https://www.acmicpc.net/problem/1920
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 23
 *
 * 1. 문제 풀이 전략
 * 정수의 범위가 -2^31~+2^31이므로 이분 탐색 알고리즘(O nlogn)을 사용한다.
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
public class Q1920 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            if (search(a, 0, n - 1, b[i])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

    }

    static boolean search(int[] a, int i, int j, int target) {
        while (i <= j) {
            int mid = (i + j) / 2;
            if (a[mid] == target) {
                return true;
            } else if (a[mid] > target) {
                j = mid - 1;
            } else if (a[mid] < target) {
                i = mid + 1;
            }
        }
        return false;
    }
}
