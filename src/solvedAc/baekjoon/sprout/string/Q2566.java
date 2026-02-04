package solvedAc.baekjoon.sprout.string;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 제목: 최댓값
 * 문제 링크: https://www.acmicpc.net/problem/2566
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 16
 *
 * 1. 문제 풀이 전략
 * 9 x 9 배열 순회하여 배열 생성하며 최댓값 찾기
 * 다시 순회하여 배열 순회하며 찾은 최댓값과 동등값일때 출력
 * 반드시 9 x9 의 2차원 배열만 주어지므로 시간 복잡도 고려 하지 않아도 됨
 * 최댓값이 두 개 이상인 경우 그 중 한 곳의 위치를 출력한다? => 복수 정답 해준다.
 *2
 *  정상 케이스
 * 3 23 85 34 17 74 25 52 65
 * 10 7 39 42 88 52 14 72 63
 * 87 42 18 78 53 45 18 84 53
 * 34 28 64 85 12 16 75 36 55
 * 21 77 45 35 28 75 90 76 1
 * 25 87 65 15 28 11 37 28 74
 * 65 27 75 41 7 89 78 64 39
 * 47 47 70 45 23 65 3 41 44
 * 87 13 82 38 31 12 29 29 80
 *  예외 케이스
 *
 * 3 23 85 34 17 74 25 52 65
 * 10 7 39 42 88 52 14 72 63
 * 87 42 18 78 53 45 18 84 53
 * 34 28 64 85 12 16 75 36 55
 * 21 77 45 35 28 75 90 76 1
 * 25 87 65 15 28 11 37 28 74
 * 65 27 75 41 7 89 78 64 39
 * 47 47 70 45 23 65 3 41 44
 * 87 13 82 38 31 12 29 29 90
 *
 * 90
 * 9 9
 *  엣지 케이스
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
 * 출력문 포멧팅 방식 헷갈림 "".format()은 python방식이다. String.format or i+" "+j를 사용하자.
 *
 */
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max=0;
        for (int i = 0; i < 9; i++) {
            StringTokenizer s = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(s.nextToken());
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (arr[i][j] == max) {
                    System.out.println(max);
                    System.out.println(String.format("%d  %d", i + 1, j + 1));
                    return;
                }
            }
        }

    }
}
*/
public class Q2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max=-1;
        int maxRow = 1, maxCol = 1;
        for (int i = 0; i < 9; i++) {
            StringTokenizer s = new StringTokenizer(sc.nextLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(s.nextToken());
                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(String.format("%d  %d", maxRow, maxCol));

    }
}
