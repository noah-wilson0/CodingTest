package solvedAc.baekjoon.sprout.Geometry1;

import java.util.Scanner;

/**
 * 제목: 삼각형 외우기
 * 문제 링크: https://www.acmicpc.net/problem/10101
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 21
 *
 * 1. 문제 풀이 전략
 *
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
 *  정수는 0보다 크고 180보다 작다고 한다. 0일떄는 어떻게 되는거지? Error아닌가?
 *  b와 c가 같은 경우를 조건문에서 뺴먹었다.
 */

public class Q10101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == 0 || b == 0 || c == 0) System.out.println("Error");
        if (a + b + c != 180) {
            System.out.println("Error");
        } else if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles");
        } else if (a != b || a != c) {
            System.out.println("Scalene");
        }
    }

}
