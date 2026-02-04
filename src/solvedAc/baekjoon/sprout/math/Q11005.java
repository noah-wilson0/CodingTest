package solvedAc.baekjoon.sprout.math;

import java.util.Scanner;

/**
 * 제목: 진법 변환 2
 * 문제 링크: https://www.acmicpc.net/problem/11005
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 3
 *
 * 1. 문제 풀이 전략
 *  10진법 n을 b진법으로 변환하기
 * 10진법을 어떻게 입력받은 b진법으로 동적으로 하지?
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
 * Integer.toString()으로 원하는대로 진법 변환가능하지만 lower case로 변환되었다.
 * 문제에서는 숫자로 표기할 수 없는 진법은 대문자로 표기한다고 하였었다.
 *
 */

public class Q11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Integer.toString(n,b).toUpperCase());

    }
}
