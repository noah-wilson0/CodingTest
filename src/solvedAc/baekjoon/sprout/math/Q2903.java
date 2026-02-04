package solvedAc.baekjoon.sprout.math;

import java.util.Scanner;

/**
 * 제목: 중앙 이동 알고리즘
 * 문제 링크: https://www.acmicpc.net/problem/2903
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 40
 *
 * 1. 문제 풀이 전략
 *  각변 중앙의 점을 하나 추가한다.
 *  정사각형 중심에 점 하나 추가한다.
 *  위 과정을 입력값 N번 반복 후 점의 수 출력
 *  맞닿은 정 사각형 변의 점은 중복 점이 생긴다.
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
 * 1.규칙성 찾는데 시간 초과
 * 어떤 것의 제곱임은 파악했다.
 * 구체적으로 공식화 하지 못함
 * => 정답 공식은 (2^n+1)^2
 * 2. 중복 점을 뺄 방법에 대해서 고민 했다.
 *  보이는 요소들에 대해서 1차원적으로 분석(중복점)에 집중해서 더 어렵게 느껴진 것 같다.
 *  잘 생각해보면 점은 한변의 점 갯수를 제곱한 값과 같았다.
 *
 *
 *  위 정보를 바탕으로 공식에 제곱이 있을 것이다, 공식에 점과 관렵된 값이 사용된다. 의 의문을 통해
 *  유추해보자면 충분히 공식을 생각해낼 수 있을 것이다.
 *  경험이 부족했다고 생각한다.
 */

public class Q2903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int)Math.pow(Math.pow(2,n)+1, 2));
    }
}
