package solvedAc.baekjoon.silver.s5;

import java.util.*;

/**
 * 제목: 크로티아 알파벳
 * 문제 링크: https://www.acmicpc.net/problem/2941
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 40
 *
 * 1. 문제 풀이 전략
 *  문자가 c,l,n,s,z일경우 에 따라 크로티아 알파벳만큼 idx ++
 * 알파벳 갯수를 합산한다.
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
 * 조건문 실수 및 오타 떄문에 자꾸 하나씩 빼먹는 실수가 크다.
 *
 */
public class Q2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int cnt = 0;

        for (int idx = 0; idx < s.length(); idx++) {
            char c = s.charAt(idx);

            if (c == 'c') {
                if (idx + 1 < s.length()) {
                    char c1 = s.charAt(idx + 1);
                    if (c1 == '=' || c1 == '-') idx++;
                }

            } else if (c == 'd') {
                if (idx + 1 < s.length()) {
                    char c1 = s.charAt(idx + 1);
                    if (c1 == '-') {
                        idx++;
                    } else if (c1 == 'z') {
                        if (idx + 2 < s.length() && s.charAt(idx + 2) == '=') {
                            idx += 2;
                        }
                    }
                }

            } else if (c == 'l') {
                if (idx + 1 < s.length() && s.charAt(idx + 1) == 'j') idx++;

            } else if (c == 'n') {
                if (idx + 1 < s.length() && s.charAt(idx + 1) == 'j') idx++;

            } else if (c == 's') {
                if (idx + 1 < s.length() && s.charAt(idx + 1) == '=') idx++;

            } else if (c == 'z') {
                if (idx + 1 < s.length() && s.charAt(idx + 1) == '=') idx++;
            }

            cnt++;
        }

        System.out.println(cnt);
        sc.close();

    }


}
