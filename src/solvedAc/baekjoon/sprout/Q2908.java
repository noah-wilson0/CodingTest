package solvedAc.baekjoon.sprout;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 제목: 상수
 * 문제 링크: https://www.acmicpc.net/problem/2908
 * 플랫폼: 백준
 * 제한시간: 30
 * 소요시간: 5
 *
 * 1. 문제 풀이 전략
 *  입력받은 두 수를 reverse한다.
 *  정수형으로 타입 캐스팅 후 더 큰 값을 출력한다.
 *
 * 2. 반례
 *  두 수가 같은 경우 : "839 839"
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


public class Q2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder reversedA = new StringBuilder(st.nextToken()).reverse();
        StringBuilder reversedB = new StringBuilder(st.nextToken()).reverse();
        Integer a = Integer.valueOf(reversedA.toString());
        Integer b = Integer.valueOf(reversedB.toString());
        if (a >= b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
