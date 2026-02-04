package solvedAc.baekjoon.sprout.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 제목:  문자열 반복
 * 문제 링크:  https://www.acmicpc.net/problem/2675
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간: 10
 *
 * 1. 문제 접근 아이디어
 *     문자열 S의 각 문자를 R만큼 반복하여 출력한다.
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

public class Q2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

            String r = stringTokenizer.nextToken();
            String s = stringTokenizer.nextToken();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                for (int k = 0; k < Integer.parseInt(r); k++) {
                    sb.append(c);
                }
            }
            System.out.println(sb);

        }
        // 2026-01-22복습 완
        /*
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(s.charAt(j));
                }
            }
        }*/


    }
}
