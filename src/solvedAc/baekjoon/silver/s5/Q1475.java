package solvedAc.baekjoon.silver.s5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 제목: 방 번호
 * 문제 링크: https://www.acmicpc.net/problem/1475
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 10
 *
 * 1. 문제 풀이 전략
 * 필요한 숫자 세트의 최솟값을 구한다.
 *  6,9는 뒤집어서 사용가능하다.
 *   6과 9는 뒤집어서 사용 가능하므로 9가 없을때 6을 대신 사용하도록 한다. 반대도 마찬가지
 * => 이렇게 하지말고 빈도수를 저장해보자
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
public class Q1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int[] numbers = new int[10];
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int n = Integer.parseInt(String.valueOf(s.charAt(i)));
            numbers[n] += 1;
        }
        int sixNine = numbers[6] + numbers[9];
        numbers[6] = (sixNine + 1) / 2;
        numbers[9] = 0;

        for (int i = 0; i < 9; i++) {
            result = Math.max(result, numbers[i]);
        }

        System.out.println(result);
    }
}
