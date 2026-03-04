package solvedAc.baekjoon.silver.s5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 제목: 숫자 찾기
 * 문제 링크: https://www.acmicpc.net/problem/10815
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간:15
 *
 * 1. 문제 풀이 전략
 * O(nlogn)의 복잡도를 가지는 이분탐색 을 써서 카드를 찾아야 된다.
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
public class Q10815 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            sb.append(search(array, 0, n - 1, sc.nextInt()) + " ");
        }
        System.out.println(sb.toString().trim());

    }

    static int search(long[] array, int i, int j, long target) {

        while (i <= j) {
            int mod = (i + j) / 2;
            if (array[mod] == target) {
                return 1;
            } else if (array[mod] < target) {
                i = mod + 1;
            } else if (array[mod] > target) {
                j = mod - 1;
            }
        }
        return 0;
    }
}
