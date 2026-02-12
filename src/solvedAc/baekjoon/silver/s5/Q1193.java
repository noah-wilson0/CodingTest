package solvedAc.baekjoon.silver.s5;

import java.util.Scanner;

/**
 * 제목: 분수 찾기
 * 문제 링크: https://www.acmicpc.net/problem/1193
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 50~38 = 48분
 *
 * 1. 문제 풀이 전략
 * 지그재그로 분수가 나열되어 있다.
 *  분자-분모합은 2~n까지 +1씩
 *  분수의 갯수는 1~n까지 +1씩
 *  대각 분수의 갯수가 홀: 왼->오, 짝 오->왼
 *  어느 대각 라인인지 아는 방법
 *  해당 대각의 위치 값: 이전 대각분수의 합 - x
 *  이전 대각 분수 갯수의 합은 n(n+1)/2 를 이용하면 되지않을까
 *  ------까지 파악 완료--------
 *  (n-1)(n-1+1)/2 => n(n-1)/2 => GPT사용
 *  x < n(n-1)/2 누적합 일때 이전 대각 분수 갯수의 합을 구할 수 있다.
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
 * 분자-분모합은 2~n까지 +1씩은 고려할 필요가 없었다.
 * 중간에 분자-분모합은 이 홀/짝에 따라 분모 분자 결정된다고 착각했었다.
 *
 *
 */
public class Q1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0; //i번째 대각선까지 누적 개수
        int i = 0; //i 번째 대각선의 갯수
        while (x > sum) {
            i++;
            sum = i * (i - 1) / 2;

        }
        int prev = sum - i+1; //i-1번째 대각선까지 누적 갯수
        int location = x - prev; // i번째 대각선 위치

        if (i % 2 != 0) {
            //홀수: 위치/현재 대각수 - 위치
            System.out.println(String.format(
                    "%d/%d",location,i-location));
        } else {
            //짝수: 현재 대각수 - 위치/위치
            System.out.println(String.format(
                    "%d/%d",i-location,location));
        }

    }
}
