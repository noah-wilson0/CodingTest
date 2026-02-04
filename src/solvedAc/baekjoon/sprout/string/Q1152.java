package solvedAc.baekjoon.sprout.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 제목: 단어의 개수
 * 문제 링크: https://www.acmicpc.net/problem/1152
 * 플랫폼: 백준
 * 제한시간: 30분
 * 소요시간:
 *
 * 1. 문제 접근 아이디어
 *    공백으로 구분한 배열의 길이를 구한다.
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
 * 1. 반드시 공백 하나일때가 아니다.  ex) "    Hello World    "와 같다면 split(" ")을 사용하면 length=10이다.
 */



public class Q1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        System.out.println(stringTokenizer.countTokens());

    }
}
