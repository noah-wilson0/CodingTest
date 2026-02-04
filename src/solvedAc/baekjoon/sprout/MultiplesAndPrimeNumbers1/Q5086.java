package solvedAc.baekjoon.sprout.MultiplesAndPrimeNumbers1;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 제목: 배수와 약수
 * 문제 링크: https://www.acmicpc.net/problem/5086
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 18
 *
 * 1. 문제 풀이 전략
 *  약수/배수를 확인후 출력
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
 * loop를 쓰지않고 좀 더 쉽게 약수와 배수를 구분할 수 있었다.
 *
 */

public class Q5086 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            if (n == 0 || m == 0) continue;

            if (m % n == 0) {
                System.out.println("factor");
            } else if (n % m == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
    }
}


