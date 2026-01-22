package solvedAc.baekjoon.sprout;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 제목: 문자열
 * 2026-01-20
 * 문제 링크: https://www.acmicpc.net/problem/9086
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간:
 *
 * 1. 문제 접근 아이디어
 * 문자열의 첫/끝 문자 출력을 위해 JAVA 내장 메서드 사용하여 해결하기
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
 *  1. char와 연산자가 결합되면 char 가 정수형으로 변환되서 결과가 나온다.
 */

public class Q9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String t = br.readLine();

        for (int i = 0; i < Integer.parseInt(t); i++) {
            String s = br.readLine();
            System.out.println(""+s.charAt(0)+s.charAt(s.length()-1));

        }

        //9086 2026-01-22복습 완 6분 소비
        // 이슈: Scanner '\0'

        /*Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            StringBuilder sb=new StringBuilder();
            sb.append(s.charAt(0));
            sb.append(s.charAt(s.length() - 1));
            System.out.println(sb);
        }*/

    }
}
