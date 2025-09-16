package solvedAc.baekjoon.Bronze.b3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 제목: 최댓값
 * 문제 링크:https://www.acmicpc.net/problem/2562
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간:
 *
 * 1. 문제 접근 아이디어
 *
 *
 * 2. 백준
 * solveVn() 메서드 사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 3. 프로그래머스
 * solution(String s)메서드  사용
 *    - 막힌 부분, 문제 발생 원인 등을 주석으로 정리
 *
 * 4. 이슈
 *
 */

public class Q2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.valueOf(br.readLine());
        int index=1;
        for (int i = 1; i < 9; i++) {
            Integer n = Integer.parseInt(br.readLine());
            if (n > max) {
                max=n;
                index = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
