package solvedAc.baekjoon.sprout.Geometry1;

import java.util.Scanner;

/**
 * 제목: 직사각형에서 탈출
 * 문제 링크: https://www.acmicpc.net/problem/1085
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간:11
 *
 * 1. 문제 풀이 전략
 *  좌표상에서 x,y,w,h의 값을 가지는 직사각형이 있다.
 *  각 4개의 변에서 한수의 위치인 (x,y)에서 가장 거리가 짧은 거리를 구하시오.
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

public class Q1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        System.out.println(Math.min(
                Math.min(x, w - x),
                Math.min(y, h - y)
        ));
    }
}
