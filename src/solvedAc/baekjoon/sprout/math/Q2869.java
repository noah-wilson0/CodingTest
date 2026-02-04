package solvedAc.baekjoon.sprout.math;

import java.util.Scanner;

/**
 * 제목: 달팽이는 올라가고 싶다.
 * 문제 링크: https://www.acmicpc.net/problem/2869
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간:7 + 9
 *
 * 1. 문제 풀이 전략
 * 달팽이가 A만큼 올라가고 B만큼 미끄러진다. V만큼 가야된다.
 * 단 정상을 올라가면 미끄러지지 않는다 => n-1횟수에서 미끄러짐이 없다
 * 예시:
 * 2-1, 2-1, 2-1, 2 =5
 * 총 4일
 *
 * while loop 사용하여 true(goal<=v)일때 마다  처음에 -b 마지막에 +A를 하여 n-1 loop시점에  goal=v가 되어
 * n loop가 skip되어 -b가 되지 않는 구조
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
 * 시간 초과가 생김 0.25초걸리는데 loop로 해결못할듯
 *
 */

public class Q2869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double v = sc.nextDouble();

/*        int goal=0;
        int day=0;
        while (goal <= v) {
            if (goal + a != v) {
                goal -= b;
                day++;
            }
            goal += a;
        }


        System.out.println(day);*/

        double x = (v - a) / (a - b) + 1;
        System.out.println((int)Math.ceil(x));
    }
}
