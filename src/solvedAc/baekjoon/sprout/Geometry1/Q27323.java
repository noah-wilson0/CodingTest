package solvedAc.baekjoon.sprout.Geometry1;

import java.util.Scanner;

/**
 * 제목: 직사각형
 * 문제 링크: https://www.acmicpc.net/problem/27323
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 1
 *
 * 1. 문제 풀이 전략
 * 직사각형 넓이 구하기
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

public class Q27323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a*b);
    }
}
