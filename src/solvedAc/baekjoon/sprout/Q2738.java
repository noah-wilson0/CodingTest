package solvedAc.baekjoon.sprout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 제목: 행렬 덧셈
 * 문제 링크: https://www.acmicpc.net/problem/2738
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 35
 *
 * 1. 문제 풀이 전략
 *  첫쨰줄 N 과 M은 행렬 A B의 크기를 나타낸다.
 *  행렬 A, B의 합을 출력한다.
 *
 *2
 *  정상 케이스
 * 3 3
 * 1 1 1
 * 2 2 2
 * 0 1 0
 * 3 3 3
 * 4 4 4
 * 5 5 100
 *
 * 4 4 4
 * 6 6 6
 * 5 6 100
 *  예외 케이스
 *  행렬의 크기가 다를 경우
 * 3 2
 * 1 1 1
 * 2 2 2
 * 0 1 0
 * 3 3
 * 4 4
 *
 * 4 4 1
 * 6 6 2
 * 0 1 0
 *  엣지 케이스
 *  0 0
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
 * 1. 행렬 N x M A와 B를 더하는 문제인데  N xN 행렬 A와 M x M 행렬 B를 더하는 문제로 착각했음
 *
 */
/*
public class Q2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer t = new StringTokenizer(br.readLine());
        int size1 = Integer.valueOf(t.nextToken());
        int[][] arr1= new int[size1][size1];

        int size2 = Integer.valueOf(t.nextToken());
        int[][] arr2= new int[size2][size2];

        for (int i = 0; i < size1; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            for (int j = 0; j < size1; j++) {
                arr1[i][j] = Integer.valueOf(s.nextToken());
            }
        }
        for (int i = 0; i < size2; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            for (int j = 0; j < size2; j++) {
                arr2[i][j] = Integer.valueOf(s.nextToken());
            }
        }
        if (size1 > size2) {
            for (int i = 0; i < size2; i++) {
                for (int j = 0; j < size2; j++) {
                    arr1[i][j] += arr2[i][j];
                }
            }
            for (int i = 0; i < size1; i++) {
                for (int j = 0; j < size1; j++) {
                    System.out.printf("%d ",arr1[i][j]);
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < size1; i++) {
                for (int j = 0; j < size1; j++) {
                    arr2[i][j] += arr1[i][j];
                }
            }
            for (int i = 0; i < size2; i++) {
                for (int j = 0; j < size2; j++) {
                    System.out.printf("%d ",arr2[i][j]);
                }
                System.out.println();
            }
        }

    }
}
*/
public class Q2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer t = new StringTokenizer(br.readLine());
        int n = Integer.valueOf(t.nextToken());
        int m = Integer.valueOf(t.nextToken());
        int[][] arr= new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                arr[i][j] = Integer.valueOf(s.nextToken());
            }
        }
        for (int i = 0; i < n; i++) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                System.out.printf("%d ",arr[i][j] + Integer.valueOf(s.nextToken()));
            }
            System.out.println();
        }
    }
}