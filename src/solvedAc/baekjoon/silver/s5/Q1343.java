package solvedAc.baekjoon.silver.s5;

import java.util.Scanner;

/**
 * 제목: 폴리오미노
 * 문제 링크: https://www.acmicpc.net/problem/1343
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 29~54=25분
 *
 * 1. 문제 풀이 전략
 *  X를 'AAAA' or 'BB'로 채워서 출력해야하고 덮을 수 없으면 -1을 출력해야한다.
 * string을 split "."으로 구분하여 배열에 저장한 후
 * loop를 돌며 array[i]가 "."이 아닐때 array[i]에 저장된 s의 길이가 짝수가 아니라면
 * -1 출력 후 break;  를 한다.
 * 짝수라면 if -4 > 0 일때 AAAA를 sb.append하고 else if -2 >0 일때 BB를 추가한다.
 * 위 과정을 반복한다.
 *
 *
 * =>   split "."가 아닌 split ""으로 해야한다.  "XXXX"같은 경우 문제 생김
 * *2
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
public class Q1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] split = s.split("");

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < split.length) {
            if (!split[i].equals(".")) {
                int j = i + 1;
                int cnt = 1;
                while (j < split.length) {
                    if (!split[j].equals(".")) {
                        cnt++;
                    } else {
                        break;
                    }
                    i++;
                    j++;
                }
                if (cnt % 2 != 0) {
                    sb = new StringBuilder("-1");
                    break;
                } else {
                    while (cnt > 0) {
                        if (cnt - 4 >= 0) {
                            cnt -= 4;
                            sb.append("AAAA");
                        } else if (cnt - 2 >= 0) {
                            cnt -= 2;
                            sb.append("BB");
                        }
                    }
                }
            } else {
                sb.append(".");
            }
            i++;
        }

        System.out.println(sb);
        sc.close();
    }
}
