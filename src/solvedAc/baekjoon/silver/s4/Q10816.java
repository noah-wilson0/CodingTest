package solvedAc.baekjoon.silver.s4;

import java.util.Arrays;
import java.util.Scanner;
/**
 * 이분 탐색  i =mod -1 j= mod+1이거 시각 자료로 완전히 이해하고 다시 풀기
 */

/**
 * 제목: 숫자 카드 2
 * 문제 링크: https://www.acmicpc.net/problem/10816
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 52~10
 *
 * 1. 문제 풀이 전략
 * 이분 탐색에서 기존 상근이 숫자 카드를 복사해서 쓰고 찾은 인덱스는 boolean[mod]로해결하기
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
 * 이분 탐색에 사용되는 배열이 정렬되어 있으므로  처음 찾은 target위치 와 target보다 큰값 위치 를 알면 갯수를 구할 수 있다.
 *
 */
public class Q10816 {
    static boolean[] check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] array = new int[n];
        check = new boolean[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            long result = search(array, 0, n - 1, sc.nextInt());
            sb.append(result + " ");
            Arrays.fill(check,false);
        }
        System.out.println(sb.toString().trim());
    }

    private static long search(int[] array, int i, int j, int target) {
        long cnt = 0;
        while (i <= j) {
            int mod = (i + j) / 2;
            if (array[mod] == target && !check[mod]) {
                check[mod] = true;
                cnt++;
            } else if (array[mod] < target) {
                i = mod + 1;
            } else if (array[mod] > target) {
                j = mod - 1;
            }
        }
        return cnt;
    }
}
