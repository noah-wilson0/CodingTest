package solvedAc.baekjoon.sprout.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 제목: 색종이
 * 문제 링크: https://www.acmicpc.net/problem/2563
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 27
 *
 * 1. 문제 풀이 전략
 * 2차원 배열 (100,100)
 * 색종이(10,10)
 * input(x,y)는 색종이 크기(10,10)을 고려해야 하므로
 * 2차원 배열을 0으로 초기화 후  색종이 부분(검은 영역)은 1로 세팅 후 배열의 합
 *
 *
 *2
 *  정상 케이스
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
 * 1.loop 시작 값 종료 값 세팅 문제
 * x~x+10, y~y+10의 관계를 2차원 배열로 계산하기 위해선
 * 2중 Loop 는 yLoop(y~~y+10) xLoop(x~x+10)와 같아야 한다.
 *
 */
/*
public class Q2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[100][100]; // [y][x]
        int t = Integer.valueOf(br.readLine());

        while (t-- > 0) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            int x=Integer.valueOf(s.nextToken());
            int y=Integer.valueOf(s.nextToken());
            for (int i = y; i < y+10; i++) {
                for (int j = x; j < x+10; j++) {
                    arr[i][j]=1;
                }
            }
        }
        int sum=0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum+=arr[i][j];
            }
        }
        System.out.println(sum);

    }
}
*/
public class Q2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[100][100];
        int t = Integer.valueOf(br.readLine());
        int sum=0;
        while (t-- > 0) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            int x=Integer.valueOf(s.nextToken());
            int y=Integer.valueOf(s.nextToken());
            for (int i = y; i < y+10; i++) {
                for (int j = x; j < x+10; j++) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = 1;
                        sum++;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}